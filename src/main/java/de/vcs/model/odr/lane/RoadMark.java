package de.vcs.model.odr.lane;

import org.xmlobjects.gml.model.geometry.AbstractGeometry;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.geometry.AbstractParametricGeometry;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class RoadMark extends AbstractOpenDriveElement {

    private RoadMarkType type;
    private RoadMarkWeight weight;
    private RoadMarkColor color;
    private String material;
    private double width;
    private LaneChange laneChange;
    private double height;
    public AbstractGeometry geometry;
    private STTransform stTransform;
    private ExplicitRoadMark explicit;
    private Type detailedType;
    public ArrayList<AbstractParametricGeometry> sway;

    public RoadMark() {
    }

    public RoadMark(RoadMarkType type, RoadMarkWeight weight, RoadMarkColor color, String material, double width,
            LaneChange laneChange, double height, AbstractGeometry geometry, STTransform stTransform,
            ExplicitRoadMark explicit, Type detailedType,
            ArrayList<AbstractParametricGeometry> sway) {
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.material = material;
        this.width = width;
        this.laneChange = laneChange;
        this.height = height;
        this.geometry = geometry;
        this.stTransform = stTransform;
        this.explicit = explicit;
        this.detailedType = detailedType;
        this.sway = sway;
    }

    public RoadMarkType getType() {
        return type;
    }

    public void setType(RoadMarkType type) {
        this.type = type;
    }

    public RoadMarkWeight getWeight() {
        return weight;
    }

    public void setWeight(RoadMarkWeight weight) {
        this.weight = weight;
    }

    public RoadMarkColor getColor() {
        return color;
    }

    public void setColor(RoadMarkColor color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public LaneChange getLaneChange() {
        return laneChange;
    }

    public void setLaneChange(LaneChange laneChange) {
        this.laneChange = laneChange;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public AbstractGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(AbstractGeometry geometry) {
        this.geometry = geometry;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }

    public ExplicitRoadMark getExplicit() {
        return explicit;
    }

    public void setExplicit(ExplicitRoadMark explicit) {
        this.explicit = explicit;
    }

    public Type getDetailedType() {
        return detailedType;
    }

    public void setDetailedType(Type detailedType) {
        this.detailedType = detailedType;
    }

    public ArrayList<AbstractParametricGeometry> getSway() {
        return sway;
    }

    public void setSway(ArrayList<AbstractParametricGeometry> sway) {
        this.sway = sway;
    }
}