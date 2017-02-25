package com.cotrafficpics.xhibernate.pojos;
// default package

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * AbstractCameraPropsV2 entity provides the base persistence definition of the
 * CameraPropsV2 entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCameraPropsV2 implements java.io.Serializable {

	// Fields

	private Integer camId;
	private Highways highways;
	private String wrhCamId;
	private String pointingDirection;
	private String camPosition;
	private String description;
	private String url;
	private Integer height;
	private Integer angle;
	private Integer updatePeriod;
	private Integer latestImageId;
	private String providerCamId;
	private String providerCamViewId;
	private String city;
	private Integer sectorIdFk;
	private String xroad;
	private String xroadAka;
	private Integer nearestNeighbor;
	private Double longitude;
	private Double latitude;
	
	private Set imageses = new HashSet(0);

	private Set casectorAssocs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCameraPropsV2() {
	}

	/** minimal constructor */
	public AbstractCameraPropsV2(Highways highways, String wrhCamId,
			String pointingDirection, String camPosition, String url,
			Integer updatePeriod, String city, String xroad) {
		this.highways = highways;
		this.wrhCamId = wrhCamId;
		this.pointingDirection = pointingDirection;
		this.camPosition = camPosition;
		this.url = url;
		this.updatePeriod = updatePeriod;
		this.city = city;
		this.xroad = xroad;
	}

	/** full constructor */
	public AbstractCameraPropsV2(Highways highways, String wrhCamId,
			String pointingDirection, String camPosition, String description,
			String url, Integer height, Integer angle, Integer updatePeriod,
			Integer latestImageId, String providerCamId,
			String providerCamViewId, String city, Integer sectorIdFk,
			String xroad, String xroadAka, Integer nearestNeighbor,
			Double longitude, Double latitude, Set imageses, Set casectorAssocs) {
		this.highways = highways;
		this.wrhCamId = wrhCamId;
		this.pointingDirection = pointingDirection;
		this.camPosition = camPosition;
		this.description = description;
		this.url = url;
		this.height = height;
		this.angle = angle;
		this.updatePeriod = updatePeriod;
		this.latestImageId = latestImageId;
		this.providerCamId = providerCamId;
		this.providerCamViewId = providerCamViewId;
		this.city = city;
		this.sectorIdFk = sectorIdFk;
		this.xroad = xroad;
		this.xroadAka = xroadAka;
		this.nearestNeighbor = nearestNeighbor;
		this.longitude = longitude;
		this.latitude = latitude;
		this.imageses = imageses;
		this.casectorAssocs = casectorAssocs;
	}

	// Property accessors

	public Integer getCamId() {
		return this.camId;
	}

	public void setCamId(Integer camId) {
		this.camId = camId;
	}

	public Highways getHighways() {
		return this.highways;
	}

	public void setHighways(Highways highways) {
		this.highways = highways;
	}

	public String getWrhCamId() {
		return this.wrhCamId;
	}

	public void setWrhCamId(String wrhCamId) {
		this.wrhCamId = wrhCamId;
	}

	public String getPointingDirection() {
		return this.pointingDirection;
	}

	public void setPointingDirection(String pointingDirection) {
		this.pointingDirection = pointingDirection;
	}

	public String getCamPosition() {
		return this.camPosition;
	}

	public void setCamPosition(String camPosition) {
		this.camPosition = camPosition;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getAngle() {
		return this.angle;
	}

	public void setAngle(Integer angle) {
		this.angle = angle;
	}

	public Integer getUpdatePeriod() {
		return this.updatePeriod;
	}

	public void setUpdatePeriod(Integer updatePeriod) {
		this.updatePeriod = updatePeriod;
	}

	public Integer getLatestImageId() {
		return this.latestImageId;
	}

	public void setLatestImageId(Integer latestImageId) {
		this.latestImageId = latestImageId;
	}

	public String getProviderCamId() {
		return this.providerCamId;
	}

	public void setProviderCamId(String providerCamId) {
		this.providerCamId = providerCamId;
	}

	public String getProviderCamViewId() {
		return this.providerCamViewId;
	}

	public void setProviderCamViewId(String providerCamViewId) {
		this.providerCamViewId = providerCamViewId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getSectorIdFk() {
		return this.sectorIdFk;
	}

	public void setSectorIdFk(Integer sectorIdFk) {
		this.sectorIdFk = sectorIdFk;
	}

	public String getXroad() {
		return this.xroad;
	}

	public void setXroad(String xroad) {
		this.xroad = xroad;
	}

	public String getXroadAka() {
		return this.xroadAka;
	}

	public void setXroadAka(String xroadAka) {
		this.xroadAka = xroadAka;
	}

	public Integer getNearestNeighbor() {
		return this.nearestNeighbor;
	}

	public void setNearestNeighbor(Integer nearestNeighbor) {
		this.nearestNeighbor = nearestNeighbor;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Set getImageses() {
		return this.imageses;
	}

	public void setImageses(Set imageses) {
		this.imageses = imageses;
	}

	public Set getCasectorAssocs() {
		return this.casectorAssocs;
	}

	public void setCasectorAssocs(Set casectorAssocs) {
		this.casectorAssocs = casectorAssocs;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.camId==((AbstractCameraPropsV2)obj).getCamId())
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getCamId().hashCode();
	}
}