package de.vcs.model.odr.geometry;

public class UVZPosition extends AbstractODRGeometry {

    private double u;
    private double v;
    private double z;

    public UVZPosition() {
    }

    public UVZPosition(double u, double v, double z) {
        this.u = u;
        this.v = v;
        this.z = z;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
