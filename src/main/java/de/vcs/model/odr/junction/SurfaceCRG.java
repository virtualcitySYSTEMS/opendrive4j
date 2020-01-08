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
    private String mode = String.valueOf(CRGMode.global);
    private String purpose;
    private double zScale;
    private STTransform stTransform;

    public SurfaceCRG() {
        this.stTransform = new STTransform();
    }

    public SurfaceCRG(String file, String mode, String purpose, double zScale, STTransform stTransform) {
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

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}