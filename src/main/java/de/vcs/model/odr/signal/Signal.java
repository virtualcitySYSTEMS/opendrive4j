package de.vcs.model.odr.signal;

import de.vcs.model.odr.object.Orientation;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.geometry.STTransform;

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
    private Orientation orientation;
    private String country;
    private String countryRevision;
    private String type;
    private String subtype;
    private double value;
    private String unit;
    private double height;
    private double width;
    private String text;
    public ArrayList<LaneValidity> validity;
    public ArrayList<Dependency> dependency;
    public ArrayList<Reference> reference;
    private SPosition linearReference;
    private STTransform stTransform;

    public Signal() {
    }

    public Signal(String id, String name, boolean dynamic, Orientation orientation, String country,
            String countryRevision, String type, String subtype, double value, String unit, double height, double width,
            String text, ArrayList<LaneValidity> validity,
            ArrayList<Dependency> dependency, ArrayList<Reference> reference,
            SPosition linearReference, STTransform stTransform) {
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
        this.validity = validity;
        this.dependency = dependency;
        this.reference = reference;
        this.linearReference = linearReference;
        this.stTransform = stTransform;
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

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
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

    public SPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(SPosition linearReference) {
        this.linearReference = linearReference;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}