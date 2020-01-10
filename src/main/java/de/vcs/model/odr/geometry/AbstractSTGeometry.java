package de.vcs.model.odr.geometry;

import org.xmlobjects.gml.model.geometry.primitives.Point;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public abstract class AbstractSTGeometry extends AbstractODRGeometry {

    private double length;
    private Point inertialReference;
    private STHPosition linearReference;

    public AbstractSTGeometry() {
        this.inertialReference = new Point();
        this.linearReference = new STHPosition();
    }

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

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }
}