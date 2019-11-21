package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.geometry.Polynom;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lanes extends AbstractOpenDriveElement {

    public ArrayList<Polynom> laneOffset;
    public ArrayList<LaneSection> laneSection;

    public Lanes() {
    }

    public Lanes(ArrayList<Polynom> laneOffset, ArrayList<LaneSection> laneSection) {
        this.laneOffset = laneOffset;
        this.laneSection = laneSection;
    }
}