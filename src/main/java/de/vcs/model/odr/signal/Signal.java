package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.lane.LaneValidity;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Signal extends AbstractOpenDriveElement {

    private String id;
    private String name;
    private boolean dynamic;
    //
    private String orientation;
    private String country;
    private String countryRevision;
    private String type;
    private String subtype;
    private double value;
    private String unit;
    private double height;
    private double width;
    private String text;
    private ArrayList<LaneValidity> validities;
    private ArrayList<Dependency> dependencies;
    private ArrayList<Reference> references;
    private STHPosition linearReference;
    private STTransform stTransform;
    private PhysicalPosition physicalPosition;

    public Signal() {
    }

    public Signal(String id, String name, boolean dynamic, String orientation, String country,
            String countryRevision, String type, String subtype, double value, String unit, double height, double width,
            String text, ArrayList<LaneValidity> validities,
            ArrayList<Dependency> dependencies, ArrayList<Reference> references,
            STHPosition linearReference, STTransform stTransform, PhysicalPosition physicalPosition) {
        this.id = id;
        this.name = name;
        this.dynamic = dynamic;
        this.orientation = orientation;
        this.country = country;
        this.countryRevision = countryRevision;
        this.type = type;
        this.subtype = subtype;
        this.value = value;
        this.unit = unit;
        this.height = height;
        this.width = width;
        this.text = text;
        this.validities = validities;
        this.dependencies = dependencies;
        this.references = references;
        this.linearReference = linearReference;
        this.stTransform = stTransform;
        this.physicalPosition = physicalPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryRevision() {
        return countryRevision;
    }

    public void setCountryRevision(String countryRevision) {
        this.countryRevision = countryRevision;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<LaneValidity> getValidities() {
        return validities;
    }

    public void setValidities(ArrayList<LaneValidity> validities) {
        this.validities = validities;
    }

    public ArrayList<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(ArrayList<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public ArrayList<Reference> getReferences() {
        return references;
    }

    public void setReferences(ArrayList<Reference> references) {
        this.references = references;
    }

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }

    public PhysicalPosition getPhysicalPosition() {
        return physicalPosition;
    }

    public void setPhysicalPosition(PhysicalPosition physicalPosition) {
        this.physicalPosition = physicalPosition;
    }
}