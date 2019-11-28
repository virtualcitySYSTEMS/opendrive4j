package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.ODRGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lane extends AbstractOpenDriveElement {

    private int id;
    private LaneType type;
    private double level;
    private ArrayList<Material> materials;
    private ArrayList<Access> accesses;
    private ArrayList<Speed> speeds;
    private Lane predecessor;
    private Lane successor;
    private ArrayList<Rule> rules;
    private ArrayList<RoadMark> roadMarks;
    private ArrayList<Height> heights;
    private ArrayList<ODRGeometry> laneGeometries;

    public Lane() {
    }

    public Lane(int id, LaneType type, double level, ArrayList<Material> materials, ArrayList<Access> accesses,
            ArrayList<Speed> speeds, Lane predecessor, Lane successor, ArrayList<Rule> rules,
            ArrayList<RoadMark> roadMarks, ArrayList<Height> heights, ArrayList<ODRGeometry> laneGeometries) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.materials = materials;
        this.accesses = accesses;
        this.speeds = speeds;
        this.predecessor = predecessor;
        this.successor = successor;
        this.rules = rules;
        this.roadMarks = roadMarks;
        this.heights = heights;
        this.laneGeometries = laneGeometries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LaneType getType() {
        return type;
    }

    public void setType(LaneType type) {
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

    public Lane getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Lane predecessor) {
        this.predecessor = predecessor;
    }

    public Lane getSuccessor() {
        return successor;
    }

    public void setSuccessor(Lane successor) {
        this.successor = successor;
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

    public ArrayList<ODRGeometry> getLaneGeometries() {
        return laneGeometries;
    }

    public void setLaneGeometries(ArrayList<ODRGeometry> laneGeometries) {
        this.laneGeometries = laneGeometries;
    }
}