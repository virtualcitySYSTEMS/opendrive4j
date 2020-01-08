package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Railroad extends AbstractOpenDriveElement {

    private ArrayList<Switch> railSwitches;

    public Railroad() {
        this.railSwitches = new ArrayList<Switch>();
    }

    public Railroad(ArrayList<Switch> railSwitch) {
        this.railSwitches = railSwitch;
    }

    public ArrayList<Switch> getRailSwitches() {
        return railSwitches;
    }

    public void setRailSwitches(ArrayList<Switch> railSwitches) {
        this.railSwitches = railSwitches;
    }
}