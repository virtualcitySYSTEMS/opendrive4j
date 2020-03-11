package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;
import de.vcs.model.odr.geometry.STTransform;
import org.xmlobjects.gml.model.GMLObject;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class RoadMark extends AbstractOpenDriveElement {

    private String type;
    private String weight;
    private String color;
    private String material;
    private double width;
    private String laneChange;
    private double height;
    private ArrayList<GMLObject> gmlGeometries;
    private STTransform stTransform;
    private ExplicitRoadMark explicit;
    private Type detailedType;
    private TreeMap<Double, AbstractODRGeometry> sways;

    public RoadMark() {
        stTransform = new STTransform();
        explicit = new ExplicitRoadMark();
        sways = new TreeMap<Double, AbstractODRGeometry>();
        detailedType = new Type();
        gmlGeometries = new ArrayList<GMLObject>();
    }

    public RoadMark(String type, String weight, String color, String material, double width, String laneChange,
            double height, ArrayList<GMLObject> gmlGeometries, STTransform stTransform,
            ExplicitRoadMark explicit, Type detailedType,
            TreeMap<Double, AbstractODRGeometry> sways) {
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.material = material;
        this.width = width;
        this.laneChange = laneChange;
        this.height = height;
        this.gmlGeometries = gmlGeometries;
        this.stTransform = stTransform;
        this.explicit = explicit;
        this.detailedType = detailedType;
        this.sways = sways;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public String getLaneChange() {
        return laneChange;
    }

    public void setLaneChange(String laneChange) {
        this.laneChange = laneChange;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<GMLObject> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<GMLObject> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
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

    public TreeMap<Double, AbstractODRGeometry> getSways() {
        return sways;
    }

    public void setSways(TreeMap<Double, AbstractODRGeometry> sways) {
        this.sways = sways;
    }
}