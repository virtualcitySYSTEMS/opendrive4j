package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Material extends AbstractOpenDriveElement {

    private String surface;
    private double friction;
    private double roughness;
    private STTransform stTransform;

    public Material() {
        stTransform = new STTransform();
    }

    public Material(String surface, double friction, double roughness, STTransform stTransform) {
        this.surface = surface;
        this.friction = friction;
        this.roughness = roughness;
        this.stTransform = stTransform;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public double getRoughness() {
        return roughness;
    }

    public void setRoughness(double roughness) {
        this.roughness = roughness;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}