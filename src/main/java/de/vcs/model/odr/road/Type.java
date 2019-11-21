package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Type extends AbstractOpenDriveElement {

    private RoadType type;
    private String country;
    private Speed speed;
    private SPosition linearReference;

    public Type() {
    }

    public Type(RoadType type, String country, Speed speed, SPosition linearReference) {
        this.type = type;
        this.country = country;
        this.speed = speed;
        this.linearReference = linearReference;
    }

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public SPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(SPosition linearReference) {
        this.linearReference = linearReference;
    }
}