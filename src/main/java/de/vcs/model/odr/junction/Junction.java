package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class Junction extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private JunctionType type;
    private ArrayList<Connection> connections;
    private ArrayList<Priority> priorities;
    private ArrayList<Controller> controllers;
    private Surfaces Surfaces;

    public Junction() {
    }

    public Junction(String name, String id, JunctionType type, ArrayList<Connection> connections,
            ArrayList<Priority> priorities, ArrayList<Controller> controllers, Surfaces Surfaces) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.connections = connections;
        this.priorities = priorities;
        this.controllers = controllers;
        this.Surfaces = Surfaces;
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

    public JunctionType getType() {
        return type;
    }

    public void setType(JunctionType type) {
        this.type = type;
    }

    public Surfaces getSurfaces() {
        return Surfaces;
    }

    public void setSurfaces(Surfaces surfaces) {
        this.Surfaces = surfaces;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Connection> connections) {
        this.connections = connections;
    }

    public ArrayList<Priority> getPriorities() {
        return priorities;
    }

    public void setPriorities(ArrayList<Priority> priorities) {
        this.priorities = priorities;
    }

    public ArrayList<Controller> getControllers() {
        return controllers;
    }

    public void setControllers(ArrayList<Controller> controllers) {
        this.controllers = controllers;
    }
}