package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Speed extends AbstractOpenDriveElement {

    private String max;
    private String unit;

    public Speed() {
    }

    public Speed(String max, String unit) {
        this.max = max;
        this.unit = unit;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}