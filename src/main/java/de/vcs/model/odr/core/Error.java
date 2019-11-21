package de.vcs.model.odr.core;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class Error {

	private double xyAbsolute;
	private double zAbsolute;
	private double xyRelative;
	private double zRelative;

	public Error(){

	}

	public Error(double xyAbsolute, double zAbsolute, double xyRelative, double zRelative) {
		this.xyAbsolute = xyAbsolute;
		this.zAbsolute = zAbsolute;
		this.xyRelative = xyRelative;
		this.zRelative = zRelative;
	}

	public double getXyAbsolute() {
		return xyAbsolute;
	}

	public void setXyAbsolute(double xyAbsolute) {
		this.xyAbsolute = xyAbsolute;
	}

	public double getzAbsolute() {
		return zAbsolute;
	}

	public void setzAbsolute(double zAbsolute) {
		this.zAbsolute = zAbsolute;
	}

	public double getXyRelative() {
		return xyRelative;
	}

	public void setXyRelative(double xyRelative) {
		this.xyRelative = xyRelative;
	}

	public double getzRelative() {
		return zRelative;
	}

	public void setzRelative(double zRelative) {
		this.zRelative = zRelative;
	}
}