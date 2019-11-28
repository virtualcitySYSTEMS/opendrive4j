package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.Polynom;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lanes extends AbstractOpenDriveElement {

    private ArrayList<Polynom> laneOffsets;
    private ArrayList<LaneSection> laneSections;

    public Lanes() {
    }

    public Lanes(ArrayList<Polynom> laneOffsets, ArrayList<LaneSection> laneSections) {
        this.laneOffsets = laneOffsets;
        this.laneSections = laneSections;
    }

    public ArrayList<Polynom> getLaneOffsets() {
        return laneOffsets;
    }

    public void setLaneOffsets(ArrayList<Polynom> laneOffsets) {
        this.laneOffsets = laneOffsets;
    }

    public ArrayList<LaneSection> getLaneSections() {
        return laneSections;
    }

    public void setLaneSections(ArrayList<LaneSection> laneSections) {
        this.laneSections = laneSections;
    }
}