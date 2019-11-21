package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Signals extends AbstractOpenDriveElement {

    public ArrayList<SignalReference> signalReferences;
    public ArrayList<Signal> signals;

    public Signals() {
    }

    public Signals(ArrayList<SignalReference> signalReferences, ArrayList<Signal> signals) {
        this.signalReferences = signalReferences;
        this.signals = signals;
    }
}