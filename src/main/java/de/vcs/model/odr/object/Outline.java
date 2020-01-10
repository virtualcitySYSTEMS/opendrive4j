package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.geometry.UVZPosition;
import de.vcs.model.odr.lane.LaneType;

import java.util.ArrayList;

public class Outline extends AbstractOpenDriveElement {

    private int id;
    private String fillType;
    private boolean outer;
    private boolean closed;
    private String laneType;
    private ArrayList<UVZPosition> cornerLocal;
    private ArrayList<STHPosition> cornerRoad;

    public Outline() {
        this.cornerLocal = new ArrayList<UVZPosition>();
        this.cornerRoad = new ArrayList<STHPosition>();
    }

    public Outline(int id, String fillType, boolean outer, boolean closed, String laneType,
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

    public String getFillType() {
        return fillType;
    }

    public void setFillType(String fillType) {
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

    public String getLaneType() {
        return laneType;
    }

    public void setLaneType(String laneType) {
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
