package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class STHPosition extends AbstractODRGeometry implements Comparable<STHPosition> {

    private double s;
    private double t;
    private double h;

    public STHPosition() {
        this.s = 0.0;
        this.t = 0.0;
        this.h = 0.0;
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

    @Override
    public int compareTo(STHPosition o) {
        if (s < o.getS()) {
            return -1;
        }
        if (s > o.getS()) {
            return 1;
        }
        if (s == o.getS()) {
            if (t < o.getT()) {
                return -1;
            }
            if (t > o.getT()) {
                return 1;
            }
        }
        return 0;
    }
}