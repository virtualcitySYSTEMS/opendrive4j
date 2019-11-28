package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class Spiral extends AbstractSTGeometry {

    private double curvStart;
    private double curvEnd;

    public Spiral() {
    }

    public Spiral(double curvStart, double curvEnd) {
        this.curvStart = curvStart;
        this.curvEnd = curvEnd;
    }

    public double getCurvStart() {
        return curvStart;
    }

    public void setCurvStart(double curvStart) {
        this.curvStart = curvStart;
    }

    public double getCurvEnd() {
        return curvEnd;
    }

    public void setCurvEnd(double curvEnd) {
        this.curvEnd = curvEnd;
    }
}