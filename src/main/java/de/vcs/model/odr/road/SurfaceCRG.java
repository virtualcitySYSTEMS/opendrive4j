package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.junction.CRGMode;
import de.vcs.model.odr.junction.CRGPurpose;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class SurfaceCRG extends AbstractOpenDriveElement {

    private String file;
    private Direction orientation;
    private CRGMode mode;
    private CRGPurpose purpose;
    private double zScale;
    private STHPosition sStart;
    private STHPosition sEnd;
    private STTransform stTransform;

    public SurfaceCRG() {
    }

    public SurfaceCRG(String file, Direction orientation, CRGMode mode, CRGPurpose purpose, double zScale,
            STHPosition sStart, STHPosition sEnd, STTransform stTransform) {
        this.file = file;
        this.orientation = orientation;
        this.mode = mode;
        this.purpose = purpose;
        this.zScale = zScale;
        this.sStart = sStart;
        this.sEnd = sEnd;
        this.stTransform = stTransform;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Direction getOrientation() {
        return orientation;
    }

    public void setOrientation(Direction orientation) {
        this.orientation = orientation;
    }

    public CRGMode getMode() {
        return mode;
    }

    public void setMode(CRGMode mode) {
        this.mode = mode;
    }

    public CRGPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(CRGPurpose purpose) {
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
}