package de.vcs.model.odr.lane;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Speed extends AbstractOpenDriveElement {

    private double max;
    private String unit;
    private STTransform stTransform;

    public Speed() {
        stTransform = new STTransform();
    }

    public Speed(double max, String unit, STTransform stTransform) {
        this.max = max;
        this.unit = unit;
        this.stTransform = stTransform;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}