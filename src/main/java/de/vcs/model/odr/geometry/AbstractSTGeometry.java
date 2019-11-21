package de.vcs.model.odr.geometry;


import de.vcs.model.gml.primitive.Point;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public abstract class AbstractSTGeometry extends AbstractParametricGeometry {

	private double length;
	private Point inertialReference;
	private SPosition linearReference;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Point getInertialReference() {
		return inertialReference;
	}

	public void setInertialReference(Point inertialReference) {
		this.inertialReference = inertialReference;
	}

	public SPosition getLinearReference() {
		return linearReference;
	}

	public void setLinearReference(SPosition linearReference) {
		this.linearReference = linearReference;
	}
}