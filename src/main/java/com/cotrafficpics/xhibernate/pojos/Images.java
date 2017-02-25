package com.cotrafficpics.xhibernate.pojos;

import java.sql.Timestamp;

/**
 * Images entity. @author MyEclipse Persistence Tools
 */
public class Images extends AbstractImages implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Images() {
	}

	/** minimal constructor */
	public Images(CameraPropsV2 cameraPropsV2, Timestamp captureTime,
			Timestamp imageTime, byte[] image) {
		super(cameraPropsV2, captureTime, imageTime, image);
	}

	/** full constructor */
	public Images(CameraPropsV2 cameraPropsV2, Timestamp captureTime,
			Timestamp imageTime, byte[] image, byte[] iconImage) {
		super(cameraPropsV2, captureTime, imageTime, image, iconImage);
	}

}
