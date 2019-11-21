package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Railroad extends AbstractOpenDriveElement {

    public ArrayList<Switch> railSwitches;

    public Railroad() {
    }

    public Railroad(ArrayList<Switch> railSwitch) {
        this.railSwitches = railSwitch;
    }
}