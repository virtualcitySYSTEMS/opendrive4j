package de.vcs.model.odr.lane;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Line extends AbstractOpenDriveElement {

    private double length;
    private double space;
    private RoadMarkRule rule;
    private double width;
    private RoadMarkColor color;
    private STTransform stTransform;

    public Line() {
    }

    public Line(double length, double space, RoadMarkRule rule, double width, RoadMarkColor color, STTransform stTransform) {
        this.length = length;
        this.space = space;
        this.rule = rule;
        this.width = width;
        this.color = color;
        this.stTransform = stTransform;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
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

    public RoadMarkColor getColor() {
        return color;
    }

    public void setColor(RoadMarkColor color) {
        this.color = color;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}