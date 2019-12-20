package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.lane.LaneValidity;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class SignalReference extends AbstractOpenDriveElement {

    private String id;
    private String orientation;
    private STHPosition linearReference;
    public ArrayList<LaneValidity> validity;

    public SignalReference() {
        linearReference = new STHPosition();
        validity = new ArrayList<LaneValidity>();
    }

    public SignalReference(String id, String orientation, STHPosition linearReference,
            ArrayList<LaneValidity> validity) {
        this.id = id;
        this.orientation = orientation;
        this.linearReference = linearReference;
        this.validity = validity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }

    public ArrayList<LaneValidity> getValidity() {
        return validity;
    }

    public void setValidity(ArrayList<LaneValidity> validity) {
        this.validity = validity;
    }
}