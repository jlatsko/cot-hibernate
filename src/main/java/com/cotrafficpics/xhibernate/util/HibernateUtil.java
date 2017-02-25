package com.cotrafficpics.xhibernate.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.cotrafficpics.xhibernate.exceptions.HibernateInitException;

/**
 * Basic Hibernate helper class for Hibernate configuration and startup.
 * <p>
 * Uses a static initializer to read startup options and initialize
 * <tt>Configuration</tt> and <tt>SessionFactory</tt>.
 * <p>
 * This class also tries to figure out if JNDI binding of the
 * <tt>SessionFactory</tt> is used, otherwise it falls back to a global static
 * variable (Singleton). If you use this helper class to obtain a
 * <tt>SessionFactory</tt> in your code, you are shielded from these deployment
 * differences.
 * <p>
 * Another advantage of this class is access to the <tt>Configuration</tt>
 * object that was used to build the current <tt>SessionFactory</tt>. You can
 * access mapping metadata programmatically with this API, and even change it
 * and rebuild the <tt>SessionFactory</tt>.
 * <p>
 * Note: This class supports annotations if you replace the line that creates a
 * Configuration object.
 * <p>
 * Note: This class supports only one data store. Support for several
 * <tt>SessionFactory</tt> instances can be easily added (through a static
 * <tt>Map</tt>, for example). You could then lookup a <tt>SessionFactory</tt>
 * by its name.
 * 
 * This class has been modified to accept and environment parameter, reference init.
 * The runtime assumption is that cmd line arguments take precedence.
 * Then properties defined in hibernate.properties or hibernate.cfg.xml.
 * Last resort is the assumption that we r running in prod.
 * 
 * @author Christian Bauer
 */
public class HibernateUtil
{
	private static final Logger log = Logger.getLogger(HibernateUtil.class);

	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	private static boolean isHibernateInit = false;
	private static String operationalEnv;
	private static final String LAST_RESORT_DEFAULT_ENV = "PROD";

	static
	{
		// Create the initial SessionFactory from the default configuration
		// files
//		log.debug("static initializer loading hibernate configuration");
		try
		{
			// Read hibernate.cfg.xml if present
			configuration = (new Configuration()).configure();
			
			ServiceRegistry registry =
					new ServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(registry);
			
			isHibernateInit = true;
		}
		catch (Throwable ex)
		{
			// We have to catch Throwable, otherwise we will miss
			// NoClassDefFoundError and other subclasses of Error
//			log.error("Building SessionFactory failed.", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	/**
	 * Returns the Hibernate configuration that was used to build the
	 * SessionFactory. Proper credentials and properties to establish the
	 * connection must be defined if jdbc style connections are needed
	 * 
	 * @return Configuration
	 */
	public static Configuration getConfiguration() throws HibernateInitException
	{
		if (!isHibernateInit)
			init();
		return configuration;
	}

	public static boolean isHibernateInit()
	{
		return isHibernateInit;
	}

	public static void setHibernateInit(boolean isHibernateInit)
	{
		HibernateUtil.isHibernateInit = isHibernateInit;
	}

	public static String getOperationalEnv()
	{
		return operationalEnv;
	}

	public static void setOperationalEnv(String operationalEnv)
	{
		HibernateUtil.operationalEnv = operationalEnv;
	}

	public static void init() throws HibernateInitException
	{
		if (("PROD".equalsIgnoreCase(operationalEnv)) || ("DEV".equalsIgnoreCase(operationalEnv)))
			initJDBC(operationalEnv);
		else
			// Probably forgot to invoke setOperationEnv(DEV or PROD)
			throw new HibernateInitException("Please invoke HibernateUtil.init(operationalEnv) or setOperationEnv");
	}
	
	/**
	 * initialize jdbc connection based on passed in environment variable, DEV or PROD.
	 * Configuration is read from the hibernate.properties file which contains jdbc
	 * connection info. Default is PROD.
	 * 
	 * @param cmdlineEnv
	 */
	private static void initJDBC(String cmdlineEnv)
	{
		String operationalEnv;
		// check cmdline parameter
		if (("PROD".equalsIgnoreCase(cmdlineEnv)) || ("DEV".equalsIgnoreCase(cmdlineEnv)))
		{
			operationalEnv = cmdlineEnv;
		}
		else
		{
			// check hibernate.properties
			String cfgEnv = configuration.getProperty("db.environment.default");
			if (("PROD".equalsIgnoreCase(cfgEnv)) || ("DEV".equalsIgnoreCase(cfgEnv)))
			{
				operationalEnv = cfgEnv;
			}
			else
				// last resort use PROD
				operationalEnv = LAST_RESORT_DEFAULT_ENV;
		}

		// configure jdbc connection
		if ("PROD".equalsIgnoreCase(operationalEnv))
		{
			// set username
			if ((configuration.getProperty("prod.db.username") == null)
					|| (configuration.getProperty("prod.db.username").isEmpty()))
				log.error("NULL of Empty prod.db.username in hibernate.properties");
			else
				configuration.setProperty("connection.username", configuration.getProperty("prod.db.username"));

			// set password
			if ((configuration.getProperty("prod.db.password") == null)
					|| (configuration.getProperty("prod.db.password").isEmpty()))
				log.error("NULL of Empty prod.db.password in hibernate.properties");
			else
				configuration.setProperty("connection.password", configuration.getProperty("prod.db.password"));

			// set url
			if ((configuration.getProperty("prod.db.url") == null)
					|| (configuration.getProperty("prod.db.url").isEmpty()))
				log.error("NULL of Empty prod.db.url in hibernate.properties");
			else
				configuration.setProperty("connection.url", configuration.getProperty("prod.db.url"));
		}

		if ("DEV".equalsIgnoreCase(operationalEnv))
		{
			// set username
			if ((configuration.getProperty("dev.db.username") == null)
					|| (configuration.getProperty("dev.db.username").isEmpty()))
				log.error("NULL of Empty dev.db.username in hibernate.properties");
			else
				configuration.setProperty("hibernate.connection.username", configuration.getProperty("dev.db.username"));

			// set password
			if ((configuration.getProperty("dev.db.password") == null)
					|| (configuration.getProperty("dev.db.password").isEmpty()))
				log.error("NULL of Empty dev.db.password in hibernate.properties");
			else
				configuration.setProperty("hibernate.connection.password", configuration.getProperty("dev.db.password"));

			// set url
			if ((configuration.getProperty("dev.db.url") == null)
					|| (configuration.getProperty("dev.db.url").isEmpty()))
				log.error("NULL of Empty dev.db.url in hibernate.properties");
			else
				configuration.setProperty("hibernate.connection.url", configuration.getProperty("dev.db.url"));
		}
		// Read hibernate.cfg.xml (has to be present)
		configuration.configure();

		// Build and store (either in JNDI or static variable)
//		rebuildSessionFactory(configuration);
		
		isHibernateInit=true;
		log.debug("Hibernate initialized, call HibernateUtil.getSessionFactory()");
	}

	/**
	 * Returns the global SessionFactory either from a static variable or a JNDI
	 * lookup.
	 * 
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory()
	{
//		String sfName = configuration.getProperty(Environment.SESSION_FACTORY_NAME);
//		if (sfName != null)
//		{
//			log.debug("Looking up SessionFactory in JNDI");
//			try
//			{
//				return (SessionFactory) new InitialContext().lookup(sfName);
//			}
//			catch (NamingException ex)
//			{
//				throw new RuntimeException(ex);
//			}
//		}
//		else if (sessionFactory == null)
//		{
//			rebuildSessionFactory();
//		}
		return sessionFactory;
	}

	/**
	 * Closes the current SessionFactory and releases all resources.
	 * <p>
	 * The only other method that can be called on HibernateUtil after this one
	 * is rebuildSessionFactory(Configuration).
	 */
	public static void shutdown()
	{
		log.debug("Shutting down Hibernate");
		// Close caches and connection pools
		sessionFactory.getCurrentSession().close();

		// Clear static variables
		sessionFactory = null;
	}

	/**
	 * Rebuild the SessionFactory with the static Configuration.
	 * <p>
	 * Note that this method should only be used with static SessionFactory
	 * management, not with JNDI or any other external registry. This method
	 * also closes the old static variable SessionFactory before, if it is still
	 * open.
	 */
	public static void rebuildSessionFactory()
	{
		log.debug("Using current Configuration to rebuild SessionFactory");
		rebuildSessionFactory(configuration);
	}

	/**
	 * Rebuild the SessionFactory with the given Hibernate Configuration.
	 * <p>
	 * HibernateUtil does not configure() the given Configuration object, it
	 * directly calls buildSessionFactory(). This method also closes the old
	 * static variable SessionFactory before, if it is still open.
	 * 
	 * @param cfg
	 */
	public static void rebuildSessionFactory(Configuration cfg)
	{
		log.debug("Rebuilding the SessionFactory from given Configuration");
//		if (sessionFactory != null && !sessionFactory.isClosed())
//			sessionFactory.close();
//		if (cfg.getProperty(Environment.SESSION_FACTORY_NAME) != null)
//		{
//			log.debug("Managing SessionFactory in JNDI");
//			cfg.buildSessionFactory();
//		}
//		else
//		{
//			log.debug("Holding SessionFactory in static variable");
			sessionFactory = cfg.buildSessionFactory();
//		}
		configuration = cfg;
	}

}
