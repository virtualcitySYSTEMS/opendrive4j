package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.UVZPosition;

public class CornerLocal extends AbstractOpenDriveElement {

    private UVZPosition uvzPosition;
    private double height;

    public CornerLocal() {
        this.uvzPosition = new UVZPosition();
    }

    public CornerLocal(UVZPosition uvzPosition, double height) {
        this.uvzPosition = uvzPosition;
        this.height = height;
    }

    public UVZPosition getUvzPosition() {
        return uvzPosition;
    }

    public void setUvzPosition(UVZPosition uvzPosition) {
        this.uvzPosition = uvzPosition;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
