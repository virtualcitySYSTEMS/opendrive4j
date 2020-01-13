package de.vcs.model.odr.core;

import de.vcs.model.odr.junction.Junction;
import de.vcs.model.odr.junction.JunctionGroup;
import de.vcs.model.odr.road.Road;
import de.vcs.model.odr.signal.Controller;
import de.vcs.model.odr.railroad.Station;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class OpenDRIVE extends AbstractOpenDriveElement {

    private ArrayList<Road> roads;
    private Header header;
    private ArrayList<Controller> controller;
    private ArrayList<Junction> junctions;
    private ArrayList<JunctionGroup> junctionGroups;
    private ArrayList<Station> stations;

    public OpenDRIVE() {
        this.roads = new ArrayList<Road>();
        this.header = new Header();
        this.controller = new ArrayList<Controller>();
        this.junctions = new ArrayList<Junction>();
        this.junctionGroups = new ArrayList<JunctionGroup>();
        this.stations = new ArrayList<Station>();
    }

    public OpenDRIVE(ArrayList<Road> roads, Header header, ArrayList<Controller> controller,
            ArrayList<Junction> junctions,
            ArrayList<JunctionGroup> junctionGroups,
            ArrayList<Station> stations) {
        this.roads = roads;
        this.header = header;
        this.controller = controller;
        this.junctions = junctions;
        this.junctionGroups = junctionGroups;
        this.stations = stations;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<Road> roads) {
        this.roads = roads;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ArrayList<Controller> getController() {
        return controller;
    }

    public void setController(ArrayList<Controller> controller) {
        this.controller = controller;
    }

    public ArrayList<Junction> getJunctions() {
        return junctions;
    }

    public void setJunctions(ArrayList<Junction> junction) {
        this.junctions = junctions;
    }

    public ArrayList<JunctionGroup> getJunctionGroups() {
        return junctionGroups;
    }

    public void setJunctionGroup(ArrayList<JunctionGroup> junctionGroups) {
        this.junctionGroups = junctionGroups;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public void setStation(ArrayList<Station> station) {
        this.stations = stations;
    }
}