package de.vcs.model.odr.geometry;

import de.vcs.model.odr.ODRObject;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public abstract class AbstractParametricGeometry extends ODRObject {

    private STTransform stTransform;
    private InertialTransform intertialTransform;

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }

    public InertialTransform getIntertialTransform() {
        return intertialTransform;
    }

    public void setIntertialTransform(InertialTransform intertialTransform) {
        this.intertialTransform = intertialTransform;
    }
}