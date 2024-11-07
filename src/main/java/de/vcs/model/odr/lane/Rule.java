package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Rule extends AbstractOpenDriveElement {

    private String value;
    private STTransform stTransform;

    public Rule() {
        stTransform = new STTransform();
    }

    public Rule(String value, STTransform stTransform) {
        this.value = value;
        this.stTransform = stTransform;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}
