package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class JunctionGroup extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private String type;
    private ArrayList<JunctionReference> junctionReference;

    public JunctionGroup() {
        this.junctionReference = new ArrayList<JunctionReference>();
    }

    public JunctionGroup(String name, String id, String type,
            ArrayList<JunctionReference> junctionReference) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.junctionReference = junctionReference;
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

    public ArrayList<JunctionReference> getJunctionReference() {
        return junctionReference;
    }

    public void setJunctionReference(ArrayList<JunctionReference> junctionReference) {
        this.junctionReference = junctionReference;
    }
}