package de.vcs.model.odr.geometry;

import org.locationtech.jts.geom.Point;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class Arc extends AbstractSTGeometry {

    private double curvature;

    public Arc() {
    }

    @Override
    public Point accept(Visitor v) {
        return v.visit(this);
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