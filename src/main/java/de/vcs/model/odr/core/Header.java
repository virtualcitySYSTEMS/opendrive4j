package de.vcs.model.odr.core;

import de.vcs.model.odr.geometry.InertialTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class Header extends AbstractOpenDriveElement {

	private int revMajor;
	private int revMinor;
	private String name;
	private double version;
	private String date;
	private double north;
	private double south;
	private double east;
	private double west;
	private String vendor;
	private GeoReference geoReference;
	private InertialTransform offset;

	public Header(){

	}

	public Header(int revMajor, int revMinor, String name, double version, String date, double north, double south, double east, double west, String vendor, GeoReference geoReference, InertialTransform offset) {
		this.revMajor = revMajor;
		this.revMinor = revMinor;
		this.name = name;
		this.version = version;
		this.date = date;
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.vendor = vendor;
		this.geoReference = geoReference;
		this.offset = offset;
	}

	public int getRevMajor() {
		return revMajor;
	}

	public void setRevMajor(int revMajor) {
		this.revMajor = revMajor;
	}

	public int getRevMinor() {
		return revMinor;
	}

	public void setRevMinor(int revMinor) {
		this.revMinor = revMinor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getNorth() {
		return north;
	}

	public void setNorth(double north) {
		this.north = north;
	}

	public double getSouth() {
		return south;
	}

	public void setSouth(double south) {
		this.south = south;
	}

	public double getEast() {
		return east;
	}

	public void setEast(double east) {
		this.east = east;
	}

	public double getWest() {
		return west;
	}

	public void setWest(double west) {
		this.west = west;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public GeoReference getGeoReference() {
		return geoReference;
	}

	public void setGeoReference(GeoReference geoReference) {
		this.geoReference = geoReference;
	}

	public InertialTransform getOffset() {
		return offset;
	}

	public void setOffset(InertialTransform offset) {
		this.offset = offset;
	}
}