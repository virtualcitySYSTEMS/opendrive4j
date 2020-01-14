package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import org.xmlobjects.gml.model.GMLObject;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class LaneSection extends AbstractOpenDriveElement {

    private boolean singleSide;
    private STHPosition linearReference;
    private ArrayList<GMLObject> gmlGeometries;
    private ArrayList<Lane> centerLanes;
    private ArrayList<Lane> leftLanes;
    private ArrayList<Lane> rightLanes;

    public LaneSection() {
        linearReference = new STHPosition();
        gmlGeometries = new ArrayList<GMLObject>();
        centerLanes = new ArrayList<Lane>();
        leftLanes = new ArrayList<Lane>();
        rightLanes = new ArrayList<Lane>();
    }

    public LaneSection(boolean singleSide, STHPosition linearReference,
            ArrayList<GMLObject> gmlGeometries, ArrayList<Lane> centerLanes,
            ArrayList<Lane> leftLanes, ArrayList<Lane> rightLanes) {
        this.singleSide = singleSide;
        this.linearReference = linearReference;
        this.gmlGeometries = gmlGeometries;
        this.centerLanes = centerLanes;
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

    public ArrayList<GMLObject> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<GMLObject> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
    }

    public ArrayList<Lane> getCenterLanes() {
        return centerLanes;
    }

    public void setCenterLanes(ArrayList<Lane> centerLanes) {
        this.centerLanes = centerLanes;
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