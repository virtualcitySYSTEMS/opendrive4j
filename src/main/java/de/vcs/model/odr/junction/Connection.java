package de.vcs.model.odr.junction;

import de.vcs.model.odr.core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public abstract class Connection extends _OpenDriveElement {

	public String id;
	public JunctionType type;
	private String incomingRoad;
	private String connectingRoad;
	private ContactPoint contactPoint;
	public PredecessorSuccessor successor;
	public LaneLink laneLink;
	public PredecessorSuccessor predecessor;

	public Connection(){

	}

}