package com.cotrafficpics.xhibernate.pojos;
// default package

/**
 * CasectorAssoc entity. @author MyEclipse Persistence Tools
 */
public class CasectorAssoc extends AbstractCasectorAssoc implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CasectorAssoc() {
	}

	/** full constructor */
	public CasectorAssoc(Sectors sectors, CameraPropsV2 cameraPropsV2) {
		super(sectors, cameraPropsV2);
	}

}
