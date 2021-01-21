package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;

public class CornerRoad extends AbstractOpenDriveElement {

    private STHPosition sthPosition;
    private double height;

    public CornerRoad() {
        this.sthPosition = new STHPosition();
    }

    public CornerRoad(STHPosition sthPosition, double height) {
        this.sthPosition = sthPosition;
        this.height = height;
    }

    public STHPosition getSthPosition() {
        return sthPosition;
    }

    public void setSthPosition(STHPosition sthPosition) {
        this.sthPosition = sthPosition;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
