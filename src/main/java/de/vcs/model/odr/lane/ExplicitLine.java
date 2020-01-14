package de.vcs.model.odr.lane;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class ExplicitLine extends AbstractOpenDriveElement {

    private double length;
    private String rule;
    private double width;
    private STTransform stTransform;

    public ExplicitLine() {
        stTransform = new STTransform();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}