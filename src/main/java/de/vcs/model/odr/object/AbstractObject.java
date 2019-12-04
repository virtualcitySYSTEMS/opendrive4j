package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.lane.LaneValidity;
import org.xmlobjects.gml.model.GMLObject;

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
    private ArrayList<GMLObject> gmlGeometries;
    private ArrayList<Outline> outlines;
    private ArrayList<Material> materials;
    private ArrayList<LaneValidity> validities;
    private STHPosition linearReference;

    public AbstractObject() {
    }

    public AbstractObject(String name, String id, double validLength, Orientation orientation, double length,
            double height,
            double width, double radius, ArrayList<GMLObject> gmlGeometries,
            ArrayList<Outline> outlines, ArrayList<Material> materials,
            ArrayList<LaneValidity> validities, STHPosition linearReference) {
        this.name = name;
        this.id = id;
        this.validLength = validLength;
        this.orientation = orientation;
        this.length = length;
        this.height = height;
        this.width = width;
        this.radius = radius;
        this.gmlGeometries = gmlGeometries;
        this.outlines = outlines;
        this.materials = materials;
        this.validities = validities;
        this.linearReference = linearReference;
    }

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

    public ArrayList<GMLObject> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<GMLObject> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
    }

    public ArrayList<Outline> getOutlines() {
        return outlines;
    }

    public void setOutlines(ArrayList<Outline> outlines) {
        this.outlines = outlines;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }

    public ArrayList<LaneValidity> getValidities() {
        return validities;
    }

    public void setValidities(ArrayList<LaneValidity> validities) {
        this.validities = validities;
    }

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }
}