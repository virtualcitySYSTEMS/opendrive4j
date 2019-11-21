package de.vcs.model.odr.geometry;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class Arc extends AbstractSTGeometry {

	private double curvature;

	public Arc(){

	}

	public Arc(double curvature) {
		this.curvature = curvature;
	}

	public double getCurvature() {
		return curvature;
	}

	public void setCurvature(double curvature) {
		this.curvature = curvature;
	}
}