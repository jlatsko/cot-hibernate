package com.cotrafficpics.xhibernate.pojos;
// default package

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * AbstractHighways entity provides the base persistence definition of the
 * Highways entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHighways implements java.io.Serializable {

	// Fields

	private Integer highwayId;
	private String highwayName;
	private String highwayNameaka;
	private String direction;
	@JsonIgnore
	private Set sectorses = new HashSet(0);
	@JsonIgnore
	private Set cameraPropsV2s = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHighways() {
	}

	/** minimal constructor */
	public AbstractHighways(String highwayName, String direction) {
		this.highwayName = highwayName;
		this.direction = direction;
	}

	/** full constructor */
	public AbstractHighways(String highwayName, String highwayNameaka,
			String direction, Set sectorses, Set cameraPropsV2s) {
		this.highwayName = highwayName;
		this.highwayNameaka = highwayNameaka;
		this.direction = direction;
		this.sectorses = sectorses;
		this.cameraPropsV2s = cameraPropsV2s;
	}

	// Property accessors

	public Integer getHighwayId() {
		return this.highwayId;
	}

	public void setHighwayId(Integer highwayId) {
		this.highwayId = highwayId;
	}

	public String getHighwayName() {
		return this.highwayName;
	}

	public void setHighwayName(String highwayName) {
		this.highwayName = highwayName;
	}

	public String getHighwayNameaka() {
		return this.highwayNameaka;
	}

	public void setHighwayNameaka(String highwayNameaka) {
		this.highwayNameaka = highwayNameaka;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Set getSectorses() {
		return this.sectorses;
	}

	public void setSectorses(Set sectorses) {
		this.sectorses = sectorses;
	}

	public Set getCameraPropsV2s() {
		return this.cameraPropsV2s;
	}

	public void setCameraPropsV2s(Set cameraPropsV2s) {
		this.cameraPropsV2s = cameraPropsV2s;
	}

}