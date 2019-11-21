package de.vcs.model.odr.lane;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Height extends AbstractOpenDriveElement {

    private double inner;
    private double outer;
    private STTransform stTransform;

    public Height() {
    }

    public Height(double inner, double outer, STTransform stTransform) {
        this.inner = inner;
        this.outer = outer;
        this.stTransform = stTransform;
    }

    public double getInner() {
        return inner;
    }

    public void setInner(double inner) {
        this.inner = inner;
    }

    public double getOuter() {
        return outer;
    }

    public void setOuter(double outer) {
        this.outer = outer;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}