package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.InertialTransform;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class SurfaceCRG extends AbstractOpenDriveElement {

    private String file;
    private String orientation;
    private String mode;
    private String purpose;
    private double zScale;
    private STHPosition sStart;
    private STHPosition sEnd;
    private STTransform stTransform;
    private InertialTransform inertialTransform;

    public SurfaceCRG() {
        this.sStart = new STHPosition();
        this.sEnd = new STHPosition();
        this.stTransform = new STTransform();
        this.inertialTransform = new InertialTransform();
    }

    public SurfaceCRG(String file, String orientation, String mode, String purpose, double zScale,
            STHPosition sStart, STHPosition sEnd, STTransform stTransform, InertialTransform inertialTransform) {
        this.file = file;
        this.orientation = orientation;
        this.mode = mode;
        this.purpose = purpose;
        this.zScale = zScale;
        this.sStart = sStart;
        this.sEnd = sEnd;
        this.stTransform = stTransform;
        this.inertialTransform = inertialTransform;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public double getzScale() {
        return zScale;
    }

    public void setzScale(double zScale) {
        this.zScale = zScale;
    }

    public STHPosition getsStart() {
        return sStart;
    }

    public void setsStart(STHPosition sStart) {
        this.sStart = sStart;
    }

    public STHPosition getsEnd() {
        return sEnd;
    }

    public void setsEnd(STHPosition sEnd) {
        this.sEnd = sEnd;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }

    public InertialTransform getInertialTransform() {
        return inertialTransform;
    }

    public void setInertialTransform(InertialTransform inertialTransform) {
        this.inertialTransform = inertialTransform;
    }
}
