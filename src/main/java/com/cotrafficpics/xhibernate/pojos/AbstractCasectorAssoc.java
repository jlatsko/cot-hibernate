package com.cotrafficpics.xhibernate.pojos;
// default package

/**
 * AbstractCasectorAssoc entity provides the base persistence definition of the
 * CasectorAssoc entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCasectorAssoc implements java.io.Serializable {

	// Fields

	private Integer id;
	private Sectors sectors;
	private CameraPropsV2 cameraPropsV2;

	// Constructors

	/** default constructor */
	public AbstractCasectorAssoc() {
	}

	/** full constructor */
	public AbstractCasectorAssoc(Sectors sectors, CameraPropsV2 cameraPropsV2) {
		this.sectors = sectors;
		this.cameraPropsV2 = cameraPropsV2;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sectors getSectors() {
		return this.sectors;
	}

	public void setSectors(Sectors sectors) {
		this.sectors = sectors;
	}

	public CameraPropsV2 getCameraPropsV2() {
		return this.cameraPropsV2;
	}

	public void setCameraPropsV2(CameraPropsV2 cameraPropsV2) {
		this.cameraPropsV2 = cameraPropsV2;
	}

}