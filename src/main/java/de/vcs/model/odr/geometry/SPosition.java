package de.vcs.model.odr.geometry;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class SPosition {

	private double s;
	private double t;

	public SPosition(){

	}

	public SPosition(double s, double t) {
		this.s = s;
		this.t = t;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
}