package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Access extends AbstractOpenDriveElement {

    private String rule;
    private String restriction;
    private STTransform stTransform;

    public Access() {
        stTransform = new STTransform();
    }

    public Access(String rule, String restriction, STTransform stTransform) {
        this.rule = rule;
        this.restriction = restriction;
        this.stTransform = stTransform;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}