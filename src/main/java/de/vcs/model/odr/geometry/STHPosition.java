package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class STHPosition extends AbstractODRGeometry {

    private double s;
    private double t;
    private double h;

    public STHPosition() {
    }

    public STHPosition(double s, double t, double h) {
        this.s = s;
        this.t = t;
        this.h = h;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}