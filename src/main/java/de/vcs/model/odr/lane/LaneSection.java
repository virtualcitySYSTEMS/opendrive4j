package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import org.locationtech.jts.geom.Geometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class LaneSection extends AbstractOpenDriveElement {

    private boolean singleSide;
    private STHPosition linearReference;
    private ArrayList<Geometry> gmlGeometries;
    private Lane centerLane;
    private ArrayList<Lane> leftLanes;
    private ArrayList<Lane> rightLanes;

    public LaneSection() {
        linearReference = new STHPosition();
        gmlGeometries = new ArrayList<Geometry>();
        centerLane = new Lane();
        leftLanes = new ArrayList<Lane>();
        rightLanes = new ArrayList<Lane>();
    }

    public LaneSection(boolean singleSide, STHPosition linearReference,
            ArrayList<Geometry> gmlGeometries, Lane centerLane,
            ArrayList<Lane> leftLanes, ArrayList<Lane> rightLanes) {
        this.singleSide = singleSide;
        this.linearReference = linearReference;
        this.gmlGeometries = gmlGeometries;
        this.centerLane = centerLane;
        this.leftLanes = leftLanes;
        this.rightLanes = rightLanes;
    }

    public boolean isSingleSide() {
        return singleSide;
    }

    public void setSingleSide(boolean singleSide) {
        this.singleSide = singleSide;
    }

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }

    public ArrayList<Geometry> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<Geometry> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
    }

    public Lane getCenterLane() {
        return centerLane;
    }

    public void setCenterLane(Lane centerLane) {
        this.centerLane = centerLane;
    }

    public ArrayList<Lane> getLeftLanes() {
        return leftLanes;
    }

    public void setLeftLanes(ArrayList<Lane> leftLanes) {
        this.leftLanes = leftLanes;
    }

    public ArrayList<Lane> getRightLanes() {
        return rightLanes;
    }

    public void setRightLanes(ArrayList<Lane> rightLanes) {
        this.rightLanes = rightLanes;
    }
}