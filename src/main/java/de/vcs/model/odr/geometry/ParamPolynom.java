package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class ParamPolynom extends AbstractSTGeometry {

    private double aU;
    private double bU;
    private double cU;
    private double dU;
    private double aV;
    private double bV;
    private double cV;
    private double dV;

    public ParamPolynom() {
    }

    public ParamPolynom(double aU, double bU, double cU, double dU, double aV, double bV, double cV, double dV) {
        this.aU = aU;
        this.bU = bU;
        this.cU = cU;
        this.dU = dU;
        this.aV = aV;
        this.bV = bV;
        this.cV = cV;
        this.dV = dV;
    }

    public double getaU() {
        return aU;
    }

    public void setaU(double aU) {
        this.aU = aU;
    }

    public double getbU() {
        return bU;
    }

    public void setbU(double bU) {
        this.bU = bU;
    }

    public double getcU() {
        return cU;
    }

    public void setcU(double cU) {
        this.cU = cU;
    }

    public double getdU() {
        return dU;
    }

    public void setdU(double dU) {
        this.dU = dU;
    }

    public double getaV() {
        return aV;
    }

    public void setaV(double aV) {
        this.aV = aV;
    }

    public double getbV() {
        return bV;
    }

    public void setbV(double bV) {
        this.bV = bV;
    }

    public double getcV() {
        return cV;
    }

    public void setcV(double cV) {
        this.cV = cV;
    }

    public double getdV() {
        return dV;
    }

    public void setdV(double dV) {
        this.dV = dV;
    }
}