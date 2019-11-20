package core;

import geometry.InertialTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class Header extends _OpenDriveElement {

	public integer revMajor;
	public integer revMinor;
	public string name;
	public double version;
	public string date;
	public double north;
	public double south;
	public double east;
	public double west;
	public string vendor;
	public AdditionalData m_AdditionalData;
	public GeoReference geoReference;
	public InertialTransform offset;

	public Header(){

	}

}