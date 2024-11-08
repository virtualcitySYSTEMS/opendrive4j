package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Station extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private String type;
    private ArrayList<Platform> platforms;

    public Station() {
        this.platforms = new ArrayList<Platform>();
    }

    public Station(String name, String id, String type,
            ArrayList<Platform> platforms) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.platforms = platforms;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<Platform> platforms) {
        this.platforms = platforms;
    }
}