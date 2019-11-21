package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Station extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private StationType type;
    public ArrayList<Platform> platform;

    public Station() {
    }

    public Station(String name, String id, StationType type,
            ArrayList<Platform> platform) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StationType getType() {
        return type;
    }

    public void setType(StationType type) {
        this.type = type;
    }
}