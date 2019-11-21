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

	public Road road;
	public Header header;
	public Controller controller;
	public Junction junction;
	public JunctionGroup junctionGroup;
	public Station station;

	public OpenDRIVE(){

	}

}