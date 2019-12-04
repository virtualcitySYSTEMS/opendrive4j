package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.geometry.UVZPosition;
import de.vcs.model.odr.lane.LaneType;

import java.util.ArrayList;

public class Outline extends AbstractOpenDriveElement {

    private int id;
    private OutlineFillType fillType;
    private boolean outer;
    private boolean closed;
    private LaneType laneType;
    private ArrayList<UVZPosition> cornerLocal;
    private ArrayList<STHPosition> cornerRoad;

    public Outline() {
    }

    public Outline(int id, OutlineFillType fillType, boolean outer, boolean closed, LaneType laneType,
            ArrayList<UVZPosition> cornerLocal, ArrayList<STHPosition> cornerRoad) {
        this.id = id;
        this.fillType = fillType;
        this.outer = outer;
        this.closed = closed;
        this.laneType = laneType;
        this.cornerLocal = cornerLocal;
        this.cornerRoad = cornerRoad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OutlineFillType getFillType() {
        return fillType;
    }

    public void setFillType(OutlineFillType fillType) {
        this.fillType = fillType;
    }

    public boolean isOuter() {
        return outer;
    }

    public void setOuter(boolean outer) {
        this.outer = outer;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public LaneType getLaneType() {
        return laneType;
    }

    public void setLaneType(LaneType laneType) {
        this.laneType = laneType;
    }

    public ArrayList<UVZPosition> getCornerLocal() {
        return cornerLocal;
    }

    public void setCornerLocal(ArrayList<UVZPosition> cornerLocal) {
        this.cornerLocal = cornerLocal;
    }

    public ArrayList<STHPosition> getCornerRoad() {
        return cornerRoad;
    }

    public void setCornerRoad(ArrayList<STHPosition> cornerRoad) {
        this.cornerRoad = cornerRoad;
    }
}
