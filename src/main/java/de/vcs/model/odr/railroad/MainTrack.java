package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.junction.ElementDir;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class MainTrack extends AbstractOpenDriveElement {

    private String id;
    private ElementDir dir;
    private SPosition linearReference;

    public MainTrack() {
    }

    public MainTrack(String id, ElementDir dir, SPosition linearReference) {
        this.id = id;
        this.dir = dir;
        this.linearReference = linearReference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ElementDir getDir() {
        return dir;
    }

    public void setDir(ElementDir dir) {
        this.dir = dir;
    }

    public SPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(SPosition linearReference) {
        this.linearReference = linearReference;
    }
}