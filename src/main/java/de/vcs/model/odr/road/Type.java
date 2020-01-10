package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Type extends AbstractOpenDriveElement {

    private String type;
    private String country;
    private Speed speed;
    private STHPosition linearReference;

    public Type() {
        this.speed = new Speed();
        this.linearReference = new STHPosition();
    }

    public Type(String type, String country, Speed speed, STHPosition linearReference) {
        this.type = type;
        this.country = country;
        this.speed = speed;
        this.linearReference = linearReference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }
}