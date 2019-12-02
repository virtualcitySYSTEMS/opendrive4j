package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class STTransform extends AbstractTransformation {

    private double hdg;
    private double pitch;
    private double roll;
    private double sOffset;
    private double tOffset;
    private double hOffset;

    public STTransform() {
    }

    public STTransform(double hdg, double pitch, double roll, double sOffset, double tOffset, double hOffset) {
        this.hdg = hdg;
        this.pitch = pitch;
        this.roll = roll;
        this.sOffset = sOffset;
        this.tOffset = tOffset;
        this.hOffset = hOffset;
    }

    public double getsOffset() {
        return sOffset;
    }

    public void setsOffset(double sOffset) {
        this.sOffset = sOffset;
    }

    public double gettOffset() {
        return tOffset;
    }

    public void settOffset(double tOffset) {
        this.tOffset = tOffset;
    }

    public double gethOffset() {
        return hOffset;
    }

    public void sethOffset(double hOffset) {
        this.hOffset = hOffset;
    }

    public double getHdg() {
        return hdg;
    }

    public void setHdg(double hdg) {
        this.hdg = hdg;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }
}