package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * A controller provides consistent states for a group of signals. This may be a
 * set of signals within a junction or a set of dynamic speed restrictions on a
 * motorway. The entire record consists of a header followed by a number of
 * dependency records.
 *
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Controller extends AbstractOpenDriveElement {

    private String id;
    private String name;
    private int sequence;
    private ArrayList<Control> controls;

    public Controller() {
        this.controls = new ArrayList<Control>();
    }

    public Controller(String id, String name, int sequence, ArrayList<Control> controls) {
        this.id = id;
        this.name = name;
        this.sequence = sequence;
        this.controls = controls;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public ArrayList<Control> getControls() {
        return controls;
    }

    public void setControls(ArrayList<Control> controls) {
        this.controls = controls;
    }
}