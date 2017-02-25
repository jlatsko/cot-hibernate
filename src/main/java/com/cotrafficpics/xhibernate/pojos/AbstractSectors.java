package com.cotrafficpics.xhibernate.pojos;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSectors entity provides the base persistence definition of the
 * Sectors entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSectors implements java.io.Serializable {

	// Fields

	private Integer sectorId;
	private Highways highways;
	private String description;
	private String sectorName;
	private Double minLongitude;
	private Double maxLongitude;
	private Double minLatitude;
	private Double maxLatitude;
	private Set casectorAssocs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSectors() {
	}

	/** minimal constructor */
	public AbstractSectors(String sectorName) {
		this.sectorName = sectorName;
	}

	/** full constructor */
	public AbstractSectors(Highways highways, String description,
			String sectorName, Double minLongitude, Double maxLongitude,
			Double minLatitude, Double maxLatitude, Set casectorAssocs) {
		this.highways = highways;
		this.description = description;
		this.sectorName = sectorName;
		this.minLongitude = minLongitude;
		this.maxLongitude = maxLongitude;
		this.minLatitude = minLatitude;
		this.maxLatitude = maxLatitude;
		this.casectorAssocs = casectorAssocs;
	}

	// Property accessors

	public Integer getSectorId() {
		return this.sectorId;
	}

	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}

	public Highways getHighways() {
		return this.highways;
	}

	public void setHighways(Highways highways) {
		this.highways = highways;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSectorName() {
		return this.sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public Double getMinLongitude() {
		return this.minLongitude;
	}

	public void setMinLongitude(Double minLongitude) {
		this.minLongitude = minLongitude;
	}

	public Double getMaxLongitude() {
		return this.maxLongitude;
	}

	public void setMaxLongitude(Double maxLongitude) {
		this.maxLongitude = maxLongitude;
	}

	public Double getMinLatitude() {
		return this.minLatitude;
	}

	public void setMinLatitude(Double minLatitude) {
		this.minLatitude = minLatitude;
	}

	public Double getMaxLatitude() {
		return this.maxLatitude;
	}

	public void setMaxLatitude(Double maxLatitude) {
		this.maxLatitude = maxLatitude;
	}

	public Set getCasectorAssocs() {
		return this.casectorAssocs;
	}

	public void setCasectorAssocs(Set casectorAssocs) {
		this.casectorAssocs = casectorAssocs;
	}

}