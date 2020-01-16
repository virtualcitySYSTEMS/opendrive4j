package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.Polynom;
import de.vcs.model.odr.road.Speed;
import org.xmlobjects.gml.model.GMLObject;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lane extends AbstractOpenDriveElement {

    private int id;
    private String type;
    private double level;
    private ArrayList<Material> materials;
    private ArrayList<Access> accesses;
    private ArrayList<Speed> speeds;
    private ArrayList<Integer> predecessorIds;
    private ArrayList<Integer> successorIds;
    private ArrayList<Rule> rules;
    private ArrayList<RoadMark> roadMarks;
    private ArrayList<Height> heights;
    private ArrayList<GMLObject> gmlGeometries;
    private ArrayList<Polynom> widths;
    private ArrayList<Polynom> borders;

    public Lane() {
        materials = new ArrayList<Material>();
        accesses = new ArrayList<Access>();
        speeds = new ArrayList<Speed>();
        rules = new ArrayList<Rule>();
        roadMarks = new ArrayList<RoadMark>();
        heights = new ArrayList<Height>();
        gmlGeometries = new ArrayList<GMLObject>();
        widths = new ArrayList<Polynom>();
        borders = new ArrayList<Polynom>();
        predecessorIds = new ArrayList<Integer>();
        successorIds = new ArrayList<Integer>();
    }

    public Lane(int id, String type, double level, ArrayList<Material> materials,
            ArrayList<Access> accesses, ArrayList<Speed> speeds, ArrayList<Integer> predecessorIds,
            ArrayList<Integer> successorIds, ArrayList<Rule> rules,
            ArrayList<RoadMark> roadMarks, ArrayList<Height> heights,
            ArrayList<GMLObject> gmlGeometries, ArrayList<Polynom> widths,
            ArrayList<Polynom> borders) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.materials = materials;
        this.accesses = accesses;
        this.speeds = speeds;
        this.predecessorIds = predecessorIds;
        this.successorIds = successorIds;
        this.rules = rules;
        this.roadMarks = roadMarks;
        this.heights = heights;
        this.gmlGeometries = gmlGeometries;
        this.widths = widths;
        this.borders = borders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }

    public ArrayList<Access> getAccesses() {
        return accesses;
    }

    public void setAccesses(ArrayList<Access> accesses) {
        this.accesses = accesses;
    }

    public ArrayList<Speed> getSpeeds() {
        return speeds;
    }

    public void setSpeeds(ArrayList<Speed> speeds) {
        this.speeds = speeds;
    }

    public ArrayList<Integer> getPredecessorIds() {
        return predecessorIds;
    }

    public void setPredecessorIds(ArrayList<Integer> predecessorIds) {
        this.predecessorIds = predecessorIds;
    }

    public ArrayList<Integer> getSuccessorIds() {
        return successorIds;
    }

    public void setSuccessorIds(ArrayList<Integer> successorIds) {
        this.successorIds = successorIds;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rule> rules) {
        this.rules = rules;
    }

    public ArrayList<RoadMark> getRoadMarks() {
        return roadMarks;
    }

    public void setRoadMarks(ArrayList<RoadMark> roadMarks) {
        this.roadMarks = roadMarks;
    }

    public ArrayList<Height> getHeights() {
        return heights;
    }

    public void setHeights(ArrayList<Height> heights) {
        this.heights = heights;
    }

    public ArrayList<GMLObject> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<GMLObject> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
    }

    public ArrayList<Polynom> getWidths() {
        return widths;
    }

    public void setWidths(ArrayList<Polynom> widths) {
        this.widths = widths;
    }

    public ArrayList<Polynom> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<Polynom> borders) {
        this.borders = borders;
    }
}