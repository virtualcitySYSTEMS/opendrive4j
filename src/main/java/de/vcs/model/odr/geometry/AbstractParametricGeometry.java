package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public abstract class AbstractParametricGeometry extends ODRGeometry {

    private STTransform stTransform;

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}