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
    private RoadMarkRule rule;
    private double width;
    private STTransform stTransform;

    public ExplicitLine() {
    }

    public ExplicitLine(double length, RoadMarkRule rule, double width, STTransform stTransform) {
        this.length = length;
        this.rule = rule;
        this.width = width;
        this.stTransform = stTransform;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public RoadMarkRule getRule() {
        return rule;
    }

    public void setRule(RoadMarkRule rule) {
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