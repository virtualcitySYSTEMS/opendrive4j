package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

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
	public ArrayList<Connection> connection;
	public ArrayList<Priority> priority;
	public ArrayList<Controller> controller;
	private Surface surface;

	public Junction(){

	}

	public Junction(String name, String id, JunctionType type, ArrayList<Connection> connection, ArrayList<Priority> priority, ArrayList<Controller> controller, Surface surface) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.connection = connection;
		this.priority = priority;
		this.controller = controller;
		this.surface = surface;
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

	public Surface getSurface() {
		return surface;
	}

	public void setSurface(Surface surface) {
		this.surface = surface;
	}
}