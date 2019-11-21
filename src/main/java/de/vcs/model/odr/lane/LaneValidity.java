package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class LaneValidity extends AbstractOpenDriveElement {

    private int fromLane;
    private int toLane;

    public LaneValidity() {
    }

    public LaneValidity(int fromLane, int toLane) {
        this.fromLane = fromLane;
        this.toLane = toLane;
    }

    public int getFromLane() {
        return fromLane;
    }

    public void setFromLane(int fromLane) {
        this.fromLane = fromLane;
    }

    public int getToLane() {
        return toLane;
    }

    public void setToLane(int toLane) {
        this.toLane = toLane;
    }
}