package de.vcs.model.odr.object;

import de.vcs.model.odr.road.Road;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.geometry.AbstractGeometry;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.geometry.SPosition;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class AbstractObject extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private double validLength;
    private Orientation orientation;
    private double length;
    private double height;
    private double width;
    private double radius;
    private STTransform stTransform;
    public ArrayList<AbstractGeometry> geometry;
    public ArrayList<Material> material;
    public ArrayList<LaneValidity> validity;
    private SPosition linearReference;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValidLength() {
        return validLength;
    }

    public void setValidLength(double validLength) {
        this.validLength = validLength;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }

    public SPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(SPosition linearReference) {
        this.linearReference = linearReference;
    }
}