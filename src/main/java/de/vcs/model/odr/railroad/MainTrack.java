package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.junction.ElementDir;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class MainTrack extends AbstractOpenDriveElement {

    private String id;
    private String dir;
    private STHPosition linearReference;

    public MainTrack() {
        this.linearReference = new STHPosition();
    }

    public MainTrack(String id, String dir, STHPosition linearReference) {
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

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }
}