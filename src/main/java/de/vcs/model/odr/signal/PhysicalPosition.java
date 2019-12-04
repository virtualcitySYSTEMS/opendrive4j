package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.InertialTransform;
import org.xmlobjects.gml.model.geometry.primitives.Point;

public class PhysicalPosition extends AbstractOpenDriveElement {

    private String roadId;
    private InertialTransform inertialTransform;
    private Point positionInertial;

    public PhysicalPosition() {
    }

    public PhysicalPosition(String roadId, InertialTransform inertialTransform,
            Point positionInertial) {
        this.roadId = roadId;
        this.inertialTransform = inertialTransform;
        this.positionInertial = positionInertial;
    }

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public InertialTransform getInertialTransform() {
        return inertialTransform;
    }

    public void setInertialTransform(InertialTransform inertialTransform) {
        this.inertialTransform = inertialTransform;
    }

    public Point getPositionInertial() {
        return positionInertial;
    }

    public void setPositionInertial(Point positionInertial) {
        this.positionInertial = positionInertial;
    }
}
