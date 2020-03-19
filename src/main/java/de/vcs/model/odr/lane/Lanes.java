package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.Polynom;

import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lanes extends AbstractOpenDriveElement {

    private TreeMap<Double, Polynom> laneOffsets;
    private TreeMap<Double, LaneSection> laneSections;

    public Lanes() {
        laneOffsets = new TreeMap<Double, Polynom>();
        laneSections = new TreeMap<Double, LaneSection>();
    }

    public Lanes(TreeMap<Double, Polynom> laneOffsets, TreeMap<Double, LaneSection> laneSections) {
        this.laneOffsets = laneOffsets;
        this.laneSections = laneSections;
    }

    public TreeMap<Double, Polynom> getLaneOffsets() {
        return laneOffsets;
    }

    public void setLaneOffsets(TreeMap<Double, Polynom> laneOffsets) {
        this.laneOffsets = laneOffsets;
    }

    public TreeMap<Double, LaneSection> getLaneSections() {
        return laneSections;
    }

    public void setLaneSections(TreeMap<Double, LaneSection> laneSections) {
        this.laneSections = laneSections;
    }
}