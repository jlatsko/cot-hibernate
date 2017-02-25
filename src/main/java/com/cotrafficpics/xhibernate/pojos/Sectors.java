package com.cotrafficpics.xhibernate.pojos;
// default package

import java.util.Set;

/**
 * Sectors entity. @author MyEclipse Persistence Tools
 */
public class Sectors extends AbstractSectors implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sectors() {
	}

	/** minimal constructor */
	public Sectors(String sectorName) {
		super(sectorName);
	}

	/** full constructor */
	public Sectors(Highways highways, String description, String sectorName,
			Double minLongitude, Double maxLongitude, Double minLatitude,
			Double maxLatitude, Set casectorAssocs) {
		super(highways, description, sectorName, minLongitude, maxLongitude,
				minLatitude, maxLatitude, casectorAssocs);
	}

}
