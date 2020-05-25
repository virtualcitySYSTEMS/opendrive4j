package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.geometry.STHRepeat;
import de.vcs.model.odr.lane.LaneValidity;
import org.locationtech.jts.geom.Geometry;

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
    private String orientation;
    private double length;
    private double height;
    private double width;
    private double radius;
    private ArrayList<STHRepeat> repeat;
    private ArrayList<Geometry> gmlGeometries;
    private ArrayList<Outline> outlines;
    private ArrayList<Material> materials;
    private ArrayList<LaneValidity> validities;
    private STHPosition linearReference;

    public AbstractObject() {
        this.repeat = new ArrayList<>();
        this.gmlGeometries = new ArrayList<Geometry>();
        this.outlines = new ArrayList<Outline>();
        this.materials = new ArrayList<Material>();
        this.validities = new ArrayList<LaneValidity>();
        this.linearReference = new STHPosition();
    }

    public AbstractObject(String name, String id, double validLength, String orientation, double length,
            double height,
            double width, double radius, ArrayList<STHRepeat> repeat, ArrayList<Geometry> gmlGeometries,
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
        this.repeat = repeat;
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

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
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

    public ArrayList<STHRepeat> getRepeat() {
        return repeat;
    }

    public void setRepeat(ArrayList<STHRepeat> repeat) {
        this.repeat = repeat;
    }

    public ArrayList<Geometry> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<Geometry> gmlGeometries) {
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