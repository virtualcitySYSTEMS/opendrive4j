package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.geometry.ODRGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class LaneSection extends AbstractOpenDriveElement {

    private boolean singleSide;
    private SPosition linearReference;
    public ArrayList<ODRGeometry> laneSectionGeometry;
    private Lane center;
    private ArrayList<Lane> left;
    public ArrayList<Lane> right;

    public LaneSection() {
    }

    public LaneSection(boolean singleSide, SPosition linearReference,
            ArrayList<ODRGeometry> laneSectionGeometry, Lane center, ArrayList<Lane> left,
            ArrayList<Lane> right) {
        this.singleSide = singleSide;
        this.linearReference = linearReference;
        this.laneSectionGeometry = laneSectionGeometry;
        this.center = center;
        this.left = left;
        this.right = right;
    }

    public boolean isSingleSide() {
        return singleSide;
    }

    public void setSingleSide(boolean singleSide) {
        this.singleSide = singleSide;
    }

    public SPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(SPosition linearReference) {
        this.linearReference = linearReference;
    }

    public Lane getCenter() {
        return center;
    }

    public void setCenter(Lane center) {
        this.center = center;
    }

    public ArrayList<Lane> getLeft() {
        return left;
    }

    public void setLeft(ArrayList<Lane> left) {
        this.left = left;
    }
}