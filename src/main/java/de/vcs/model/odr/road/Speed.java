package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Speed extends AbstractOpenDriveElement {

    private MaxSpeed max;
    private String unit;

    public Speed() {
    }

    public Speed(MaxSpeed max, String unit) {
        this.max = max;
        this.unit = unit;
    }

    public MaxSpeed getMax() {
        return max;
    }

    public void setMax(MaxSpeed max) {
        this.max = max;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}