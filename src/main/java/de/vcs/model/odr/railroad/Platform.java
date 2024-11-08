package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Platform extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private ArrayList<Segment> segments;

    public Platform() {
        this.segments = new ArrayList<Segment>();
    }

    public Platform(String name, String id, ArrayList<Segment> segments) {
        this.name = name;
        this.id = id;
        this.segments = segments;
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

    public ArrayList<Segment> getSegments() {
        return segments;
    }

    public void setSegments(ArrayList<Segment> segments) {
        this.segments = segments;
    }
}