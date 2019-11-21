package de.vcs.model.odr.signal;

import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.object.Orientation;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class SignalReference extends AbstractOpenDriveElement {

    private String id;
    private Orientation orientation;
    private SPosition linearReference;
    public ArrayList<LaneValidity> validity;

    public SignalReference() {
    }

    public SignalReference(String id, Orientation orientation, SPosition linearReference,
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

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public SPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(SPosition linearReference) {
        this.linearReference = linearReference;
    }
}