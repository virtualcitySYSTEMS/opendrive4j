package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Signals extends AbstractOpenDriveElement {

    private ArrayList<SignalReference> signalReferences;
    private ArrayList<Signal> signals;

    public Signals() {
    }

    public Signals(ArrayList<SignalReference> signalReferences, ArrayList<Signal> signals) {
        this.signalReferences = signalReferences;
        this.signals = signals;
    }

    public ArrayList<SignalReference> getSignalReferences() {
        return signalReferences;
    }

    public void setSignalReferences(ArrayList<SignalReference> signalReferences) {
        this.signalReferences = signalReferences;
    }

    public ArrayList<Signal> getSignals() {
        return signals;
    }

    public void setSignals(ArrayList<Signal> signals) {
        this.signals = signals;
    }
}