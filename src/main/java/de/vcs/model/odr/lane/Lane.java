package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.geometry.AbstractGeometry;

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
    public ArrayList<Material> materials;
    public ArrayList<Access> access;
    public ArrayList<Speed> speed;
    private Lane predecessor;
    private Lane successor;
    public ArrayList<Rule> rule;
    public ArrayList<RoadMark> roadMark;
    public ArrayList<Height> height;
    public ArrayList<AbstractGeometry> laneGeometry;

    public Lane() {
    }

    public Lane(int id, LaneType type, double level, ArrayList<Material> materials, ArrayList<Access> access,
                ArrayList<Speed> speed, Lane predecessor, Lane successor, ArrayList<Rule> rule,
                ArrayList<RoadMark> roadMark, ArrayList<Height> height, ArrayList<AbstractGeometry> laneGeometry) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.materials = materials;
        this.access = access;
        this.speed = speed;
        this.predecessor = predecessor;
        this.successor = successor;
        this.rule = rule;
        this.roadMark = roadMark;
        this.height = height;
        this.laneGeometry = laneGeometry;
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
}