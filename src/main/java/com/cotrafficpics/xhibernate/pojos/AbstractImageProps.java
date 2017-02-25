package com.cotrafficpics.xhibernate.pojos;
// default package

/**
 * AbstractImageProps entity provides the base persistence definition of the
 * ImageProps entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImageProps implements java.io.Serializable {

	// Fields

	private Integer camIdFk;
	private Integer processRows;
	private Integer cropTop;
	private Integer cropBottom;
	private Integer cropLeft;
	private Integer cropRight;
	private String imageSize;
	private Integer maxObjectSize;
	private Integer minObjectSize;
	private Integer numLanes;
	private Integer numRows;
	private String trafficDirection;
	private String objectDescription;
	private Integer objectDistance;
	private String configFilename;
	private String descriptorFilename;
	private String ocrProcess;

	// Constructors

	/** default constructor */
	public AbstractImageProps() {
	}

	/** minimal constructor */
	public AbstractImageProps(String trafficDirection, String ocrProcess) {
		this.trafficDirection = trafficDirection;
		this.ocrProcess = ocrProcess;
	}

	/** full constructor */
	public AbstractImageProps(Integer processRows, Integer cropTop,
			Integer cropBottom, Integer cropLeft, Integer cropRight,
			String imageSize, Integer maxObjectSize, Integer minObjectSize,
			Integer numLanes, Integer numRows, String trafficDirection,
			String objectDescription, Integer objectDistance,
			String configFilename, String descriptorFilename, String ocrProcess) {
		this.processRows = processRows;
		this.cropTop = cropTop;
		this.cropBottom = cropBottom;
		this.cropLeft = cropLeft;
		this.cropRight = cropRight;
		this.imageSize = imageSize;
		this.maxObjectSize = maxObjectSize;
		this.minObjectSize = minObjectSize;
		this.numLanes = numLanes;
		this.numRows = numRows;
		this.trafficDirection = trafficDirection;
		this.objectDescription = objectDescription;
		this.objectDistance = objectDistance;
		this.configFilename = configFilename;
		this.descriptorFilename = descriptorFilename;
		this.ocrProcess = ocrProcess;
	}

	// Property accessors

	public Integer getCamIdFk() {
		return this.camIdFk;
	}

	public void setCamIdFk(Integer camIdFk) {
		this.camIdFk = camIdFk;
	}

	public Integer getProcessRows() {
		return this.processRows;
	}

	public void setProcessRows(Integer processRows) {
		this.processRows = processRows;
	}

	public Integer getCropTop() {
		return this.cropTop;
	}

	public void setCropTop(Integer cropTop) {
		this.cropTop = cropTop;
	}

	public Integer getCropBottom() {
		return this.cropBottom;
	}

	public void setCropBottom(Integer cropBottom) {
		this.cropBottom = cropBottom;
	}

	public Integer getCropLeft() {
		return this.cropLeft;
	}

	public void setCropLeft(Integer cropLeft) {
		this.cropLeft = cropLeft;
	}

	public Integer getCropRight() {
		return this.cropRight;
	}

	public void setCropRight(Integer cropRight) {
		this.cropRight = cropRight;
	}

	public String getImageSize() {
		return this.imageSize;
	}

	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}

	public Integer getMaxObjectSize() {
		return this.maxObjectSize;
	}

	public void setMaxObjectSize(Integer maxObjectSize) {
		this.maxObjectSize = maxObjectSize;
	}

	public Integer getMinObjectSize() {
		return this.minObjectSize;
	}

	public void setMinObjectSize(Integer minObjectSize) {
		this.minObjectSize = minObjectSize;
	}

	public Integer getNumLanes() {
		return this.numLanes;
	}

	public void setNumLanes(Integer numLanes) {
		this.numLanes = numLanes;
	}

	public Integer getNumRows() {
		return this.numRows;
	}

	public void setNumRows(Integer numRows) {
		this.numRows = numRows;
	}

	public String getTrafficDirection() {
		return this.trafficDirection;
	}

	public void setTrafficDirection(String trafficDirection) {
		this.trafficDirection = trafficDirection;
	}

	public String getObjectDescription() {
		return this.objectDescription;
	}

	public void setObjectDescription(String objectDescription) {
		this.objectDescription = objectDescription;
	}

	public Integer getObjectDistance() {
		return this.objectDistance;
	}

	public void setObjectDistance(Integer objectDistance) {
		this.objectDistance = objectDistance;
	}

	public String getConfigFilename() {
		return this.configFilename;
	}

	public void setConfigFilename(String configFilename) {
		this.configFilename = configFilename;
	}

	public String getDescriptorFilename() {
		return this.descriptorFilename;
	}

	public void setDescriptorFilename(String descriptorFilename) {
		this.descriptorFilename = descriptorFilename;
	}

	public String getOcrProcess() {
		return this.ocrProcess;
	}

	public void setOcrProcess(String ocrProcess) {
		this.ocrProcess = ocrProcess;
	}

}