package com.cotrafficpics.xhibernate.pojos;
// default package

import java.util.Set;

/**
 * Highways entity. @author MyEclipse Persistence Tools
 */
public class Highways extends AbstractHighways implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Highways() {
	}

	/** minimal constructor */
	public Highways(String highwayName, String direction) {
		super(highwayName, direction);
	}

	/** full constructor */
	public Highways(String highwayName, String highwayNameaka,
			String direction, Set sectorses, Set cameraPropsV2s) {
		super(highwayName, highwayNameaka, direction, sectorses, cameraPropsV2s);
	}

}
