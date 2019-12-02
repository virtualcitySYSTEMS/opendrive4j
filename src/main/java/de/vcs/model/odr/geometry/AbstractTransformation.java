package de.vcs.model.odr.geometry;

import de.vcs.model.odr.ODRObject;

public abstract class AbstractTransformation extends ODRObject {

    private double hdg;
    private double pitch;
    private double roll;

    public AbstractTransformation() {
    }

    public AbstractTransformation(double hdg, double pitch, double roll) {
        this.hdg = hdg;
        this.pitch = pitch;
        this.roll = roll;
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
