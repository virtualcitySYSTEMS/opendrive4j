package de.vcs.model.odr.core;

import geometry.InertialTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class Header extends _OpenDriveElement {

	public int revMajor;
	public int revMinor;
	public String name;
	public double version;
	public String date;
	public double north;
	public double south;
	public double east;
	public double west;
	public String vendor;
	public AdditionalData m_AdditionalData;
	public GeoReference geoReference;
	public InertialTransform offset;

	public Header(){

	}

}