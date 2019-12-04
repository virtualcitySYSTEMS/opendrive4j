package de.vcs.model.odr.geometry;

import de.vcs.model.odr.ODRObject;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public abstract class AbstractODRGeometry extends ODRObject {

    private String id;
    private STTransform stTransform;
    private InertialTransform intertialTransform;

    public AbstractODRGeometry() {
    }

    public AbstractODRGeometry(String id, STTransform stTransform,
            InertialTransform intertialTransform) {
        this.id = id;
        this.stTransform = stTransform;
        this.intertialTransform = intertialTransform;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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