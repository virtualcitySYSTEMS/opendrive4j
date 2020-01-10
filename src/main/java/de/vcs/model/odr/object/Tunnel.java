package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Tunnel extends AbstractObject {

    private String type;
    private boolean lighting;
    private boolean daylight;

    public Tunnel() {
    }

    public Tunnel(String type, boolean lighting, boolean daylight) {
        this.type = type;
        this.lighting = lighting;
        this.daylight = daylight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLighting() {
        return lighting;
    }

    public void setLighting(boolean lighting) {
        this.lighting = lighting;
    }

    public boolean isDaylight() {
        return daylight;
    }

    public void setDaylight(boolean daylight) {
        this.daylight = daylight;
    }
}