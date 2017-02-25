package com.cotrafficpics.xhibernate.pojos;
// default package

/**
 * ImageProps entity. @author MyEclipse Persistence Tools
 */
public class ImageProps extends AbstractImageProps implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImageProps() {
	}

	/** minimal constructor */
	public ImageProps(String trafficDirection, String ocrProcess) {
		super(trafficDirection, ocrProcess);
	}

	/** full constructor */
	public ImageProps(Integer processRows, Integer cropTop, Integer cropBottom,
			Integer cropLeft, Integer cropRight, String imageSize,
			Integer maxObjectSize, Integer minObjectSize, Integer numLanes,
			Integer numRows, String trafficDirection, String objectDescription,
			Integer objectDistance, String configFilename,
			String descriptorFilename, String ocrProcess) {
		super(processRows, cropTop, cropBottom, cropLeft, cropRight, imageSize,
				maxObjectSize, minObjectSize, numLanes, numRows,
				trafficDirection, objectDescription, objectDistance,
				configFilename, descriptorFilename, ocrProcess);
	}

}
