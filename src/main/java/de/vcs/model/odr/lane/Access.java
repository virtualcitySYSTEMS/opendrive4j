package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Access extends AbstractOpenDriveElement {

    private AccessRule rule;
    private AccessRestriction restriction;
    private STTransform stTransform;

    public Access() {
    }

    public Access(AccessRule rule, AccessRestriction restriction, STTransform stTransform) {
        this.rule = rule;
        this.restriction = restriction;
        this.stTransform = stTransform;
    }

    public AccessRule getRule() {
        return rule;
    }

    public void setRule(AccessRule rule) {
        this.rule = rule;
    }

    public AccessRestriction getRestriction() {
        return restriction;
    }

    public void setRestriction(AccessRestriction restriction) {
        this.restriction = restriction;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}