package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.Polynom;
import de.vcs.model.odr.road.Speed;
import org.locationtech.jts.geom.Geometry;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lane extends AbstractOpenDriveElement {

    private int id;
    private String type;
    private boolean level;
    private ArrayList<Material> materials;
    private ArrayList<Access> accesses;
    private ArrayList<Speed> speeds;
    private int predecessorId;
    private int successorId;
    private ArrayList<Rule> rules;
    private ArrayList<RoadMark> roadMarks;
    private ArrayList<Height> heights;
    private ArrayList<Geometry> gmlGeometries;
    private TreeMap<Double, Polynom> widths;
    private TreeMap<Double, Polynom> borders;

    public Lane() {
        materials = new ArrayList<Material>();
        accesses = new ArrayList<Access>();
        speeds = new ArrayList<Speed>();
        rules = new ArrayList<Rule>();
        roadMarks = new ArrayList<RoadMark>();
        heights = new ArrayList<Height>();
        gmlGeometries = new ArrayList<Geometry>();
        widths = new TreeMap<Double, Polynom>();
        borders = new TreeMap<Double, Polynom>();
    }

    public Lane(int id, String type, boolean level, ArrayList<Material> materials,
            ArrayList<Access> accesses, ArrayList<Speed> speeds, int predecessorId,
            int successorId, ArrayList<Rule> rules,
            ArrayList<RoadMark> roadMarks, ArrayList<Height> heights,
            ArrayList<Geometry> gmlGeometries, TreeMap<Double, Polynom> widths,
            TreeMap<Double, Polynom> borders) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.materials = materials;
        this.accesses = accesses;
        this.speeds = speeds;
        this.predecessorId = predecessorId;
        this.successorId = successorId;
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

    public boolean getLevel() {
        return level;
    }

    public void setLevel(boolean level) {
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

    public int getPredecessorId() {
        return predecessorId;
    }

    public void setPredecessorId(int predecessorId) {
        this.predecessorId = predecessorId;
    }

    public int getSuccessorId() {
        return successorId;
    }

    public void setSuccessorId(int successorId) {
        this.successorId = successorId;
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

    public ArrayList<Geometry> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<Geometry> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
    }

    public TreeMap<Double, Polynom> getWidths() {
        return widths;
    }

    public void setWidths(TreeMap<Double, Polynom> widths) {
        this.widths = widths;
    }

    public TreeMap<Double, Polynom> getBorders() {
        return borders;
    }

    public void setBorders(TreeMap<Double, Polynom> borders) {
        this.borders = borders;
    }
}