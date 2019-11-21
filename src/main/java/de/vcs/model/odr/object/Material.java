package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Material extends AbstractOpenDriveElement {

    private String surface;
    private double friction;
    private double roughness;

    public Material() {
    }

    public Material(String surface, double friction, double roughness) {
        this.surface = surface;
        this.friction = friction;
        this.roughness = roughness;
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
}