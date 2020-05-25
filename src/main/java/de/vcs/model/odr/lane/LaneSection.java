package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import org.locationtech.jts.geom.Geometry;

import java.util.ArrayList;
import java.util.TreeMap;

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
    private TreeMap<Integer, Lane> leftLanes;
    private TreeMap<Integer, Lane> rightLanes;

    public LaneSection() {
        linearReference = new STHPosition();
        gmlGeometries = new ArrayList<>();
        centerLane = new Lane();
        leftLanes = new TreeMap<>();
        rightLanes = new TreeMap<>();
    }

    public LaneSection(boolean singleSide, STHPosition linearReference,
            ArrayList<Geometry> gmlGeometries, Lane centerLane,
            TreeMap<Integer, Lane> leftLanes, TreeMap<Integer, Lane> rightLanes) {
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

    public TreeMap<Integer, Lane> getLeftLanes() {
        return leftLanes;
    }

    public void setLeftLanes(TreeMap<Integer, Lane> leftLanes) {
        this.leftLanes = leftLanes;
    }

    public TreeMap<Integer, Lane> getRightLanes() {
        return rightLanes;
    }

    public void setRightLanes(TreeMap<Integer, Lane> rightLanes) {
        this.rightLanes = rightLanes;
    }
}