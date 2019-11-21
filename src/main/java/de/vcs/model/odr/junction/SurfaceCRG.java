package de.vcs.model.odr.junction;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class SurfaceCRG extends AbstractOpenDriveElement {

    private String file;
    private CRGMode mode = CRGMode.global;
    private CRGPurpose purpose;
    private double zScale;
    private STTransform stTransform;

    public SurfaceCRG() {
    }

    public SurfaceCRG(String file, CRGMode mode, CRGPurpose purpose, double zScale, STTransform stTransform) {
        this.file = file;
        this.mode = mode;
        this.purpose = purpose;
        this.zScale = zScale;
        this.stTransform = stTransform;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}