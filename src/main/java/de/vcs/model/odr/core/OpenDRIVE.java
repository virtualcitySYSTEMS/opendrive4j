package de.vcs.model.odr.core;

import de.vcs.model.odr.junction.Junction;
import de.vcs.model.odr.junction.JunctionGroup;
import de.vcs.model.odr.road.Road;
import de.vcs.model.odr.signal.Controller;
import de.vcs.model.odr.railroad.Station;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class OpenDRIVE {

	private Road road;
	private Header header;
	private Controller controller;
	private Junction junction;
	private JunctionGroup junctionGroup;
	private Station station;

	public OpenDRIVE(){

	}

	public OpenDRIVE(Road road, Header header, Controller controller, Junction junction, JunctionGroup junctionGroup, Station station) {
		this.road = road;
		this.header = header;
		this.controller = controller;
		this.junction = junction;
		this.junctionGroup = junctionGroup;
		this.station = station;
	}

	public Road getRoad() {
		return road;
	}

	public void setRoad(Road road) {
		this.road = road;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public Junction getJunction() {
		return junction;
	}

	public void setJunction(Junction junction) {
		this.junction = junction;
	}

	public JunctionGroup getJunctionGroup() {
		return junctionGroup;
	}

	public void setJunctionGroup(JunctionGroup junctionGroup) {
		this.junctionGroup = junctionGroup;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
}