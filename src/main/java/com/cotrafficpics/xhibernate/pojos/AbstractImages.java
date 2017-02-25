package com.cotrafficpics.xhibernate.pojos;

import java.sql.Timestamp;

/**
 * AbstractImages entity provides the base persistence definition of the Images
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImages implements java.io.Serializable {

	// Fields

	private Integer imageId;
	private CameraPropsV2 cameraPropsV2;
	private Timestamp captureTime;
	private Timestamp imageTime;
	private byte[] image;
	private byte[] iconImage;

	// Constructors

	/** default constructor */
	public AbstractImages() {
	}

	/** minimal constructor */
	public AbstractImages(CameraPropsV2 cameraPropsV2, Timestamp captureTime,
			Timestamp imageTime, byte[] image) {
		this.cameraPropsV2 = cameraPropsV2;
		this.captureTime = captureTime;
		this.imageTime = imageTime;
		this.image = image;
	}

	/** full constructor */
	public AbstractImages(CameraPropsV2 cameraPropsV2, Timestamp captureTime,
			Timestamp imageTime, byte[] image, byte[] iconImage) {
		this.cameraPropsV2 = cameraPropsV2;
		this.captureTime = captureTime;
		this.imageTime = imageTime;
		this.image = image;
		this.iconImage = iconImage;
	}

	// Property accessors

	public Integer getImageId() {
		return this.imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public CameraPropsV2 getCameraPropsV2() {
		return this.cameraPropsV2;
	}

	public void setCameraPropsV2(CameraPropsV2 cameraPropsV2) {
		this.cameraPropsV2 = cameraPropsV2;
	}

	public Timestamp getCaptureTime() {
		return this.captureTime;
	}

	public void setCaptureTime(Timestamp captureTime) {
		this.captureTime = captureTime;
	}

	public Timestamp getImageTime() {
		return this.imageTime;
	}

	public void setImageTime(Timestamp imageTime) {
		this.imageTime = imageTime;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public byte[] getIconImage() {
		return this.iconImage;
	}

	public void setIconImage(byte[] iconImage) {
		this.iconImage = iconImage;
	}

}