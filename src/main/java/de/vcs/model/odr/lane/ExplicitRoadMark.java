package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class ExplicitRoadMark extends AbstractOpenDriveElement {

    private ArrayList<Line> lines;

    public ExplicitRoadMark() {
        lines = new ArrayList<Line>();
    }

    public ExplicitRoadMark(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
}