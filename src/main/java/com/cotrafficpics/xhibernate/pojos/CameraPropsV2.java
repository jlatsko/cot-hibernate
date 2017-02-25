package com.cotrafficpics.xhibernate.pojos;
// default package

import java.util.Set;

/**
 * CameraPropsV2 entity. @author MyEclipse Persistence Tools
 */
public class CameraPropsV2 extends AbstractCameraPropsV2 implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CameraPropsV2() {
	}

	/** minimal constructor TODO - city, xroad should not be required for 
	 * minimal ctor. And lat/long should be incorporated into minimal ctor. */
	public CameraPropsV2(Highways highways, String wrhCamId,
			String pointingDirection, String camPosition, String url,
			Integer updatePeriod, String city, String xroad) {
		super(highways, wrhCamId, pointingDirection, camPosition, url,
				updatePeriod, city, xroad);
	}

	/** full constructor */
	public CameraPropsV2(Highways highways, String wrhCamId,
			String pointingDirection, String camPosition, String description,
			String url, Integer height, Integer angle, Integer updatePeriod,
			Integer latestImageId, String providerCamId,
			String providerCamViewId, String city, Integer sectorIdFk,
			String xroad, String xroadAka, Integer nearestNeighbor,
			Double longitude, Double latitude, Set imageses, Set casectorAssocs) {
		super(highways, wrhCamId, pointingDirection, camPosition, description,
				url, height, angle, updatePeriod, latestImageId, providerCamId,
				providerCamViewId, city, sectorIdFk, xroad, xroadAka,
				nearestNeighbor, longitude, latitude, imageses, casectorAssocs);
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public int hashCode() {
		return super.hashCode();
	}
}
