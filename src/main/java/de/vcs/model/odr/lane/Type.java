package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Type extends AbstractOpenDriveElement {

    private String name;
    private double width;
    public ArrayList<Line> line;

    public Type() {
    }

    public Type(String name, double width, ArrayList<Line> line) {
        this.name = name;
        this.width = width;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}