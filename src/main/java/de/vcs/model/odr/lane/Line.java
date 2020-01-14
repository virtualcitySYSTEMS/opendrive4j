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
    private String rule;
    private double width;
    private String color;
    private STTransform stTransform;

    public Line() {
        stTransform = new STTransform();
    }

    public Line(double length, double space, String rule, double width, String color,
            STTransform stTransform) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public STTransform getStTransform() {
        return stTransform;
    }

    public void setStTransform(STTransform stTransform) {
        this.stTransform = stTransform;
    }
}