package de.vcs.model.odr.lane;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class ExplicitRoadMark extends AbstractOpenDriveElement {

    public ArrayList<ExplicitLine> lines;

    public ExplicitRoadMark() {
    }

    public ExplicitRoadMark(ArrayList<ExplicitLine> lines) {
        this.lines = lines;
    }
}