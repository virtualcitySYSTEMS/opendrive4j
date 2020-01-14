package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Type extends AbstractOpenDriveElement {

    private String name;
    private double width;
    public ArrayList<Line> lines;

    public Type() {
        lines = new ArrayList<Line>();
    }

    public Type(String name, double width, ArrayList<Line> lines) {
        this.name = name;
        this.width = width;
        this.lines = lines;
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

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
}