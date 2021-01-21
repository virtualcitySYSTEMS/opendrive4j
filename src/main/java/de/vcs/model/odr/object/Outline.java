package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

public class Outline extends AbstractOpenDriveElement {

    private int id;
    private String fillType;
    private boolean outer;
    private boolean closed;
    private String laneType;
    private ArrayList<CornerLocal> cornerLocal;
    private ArrayList<CornerRoad> cornerRoad;

    public Outline() {
        this.cornerLocal = new ArrayList<CornerLocal>();
        this.cornerRoad = new ArrayList<CornerRoad>();
    }

    public Outline(int id, String fillType, boolean outer, boolean closed, String laneType,
            ArrayList<CornerLocal> cornerLocal, ArrayList<CornerRoad> cornerRoad) {
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

    public ArrayList<CornerLocal> getCornerLocal() {
        return cornerLocal;
    }

    public void setCornerLocal(ArrayList<CornerLocal> cornerLocal) {
        this.cornerLocal = cornerLocal;
    }

    public ArrayList<CornerRoad> getCornerRoad() {
        return cornerRoad;
    }

    public void setCornerRoad(ArrayList<CornerRoad> cornerRoad) {
        this.cornerRoad = cornerRoad;
    }
}
