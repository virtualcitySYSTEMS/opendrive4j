package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class ExplicitRoadMark extends AbstractOpenDriveElement {

    private ArrayList<ExplicitLine> lines;

    public ExplicitRoadMark() {
        lines = new ArrayList<ExplicitLine>();
    }

    public ExplicitRoadMark(ArrayList<ExplicitLine> lines) {
        this.lines = lines;
    }

    public ArrayList<ExplicitLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<ExplicitLine> lines) {
        this.lines = lines;
    }
}