package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class Connection extends AbstractOpenDriveElement {

	private String id;
	private JunctionType type;
	private String incomingRoad;
	private String connectingRoad;
	private ContactPoint contactPoint;
	private PredecessorSuccessor predecessor;
	private PredecessorSuccessor successor;
	public ArrayList<LaneLink> laneLink;

	public Connection(){

	}

	/**
	 * normal junction
	 * @param id
	 * @param type
	 * @param incomingRoad
	 * @param connectingRoad
	 * @param contactPoint
	 * @param laneLink
	 */
	public Connection(String id, JunctionType type, String incomingRoad, String connectingRoad, ContactPoint contactPoint, ArrayList<LaneLink> laneLink) {
		this.id = id;
		this.type = type;
		this.incomingRoad = incomingRoad;
		this.connectingRoad = connectingRoad;
		this.contactPoint = contactPoint;
		this.laneLink = laneLink;
	}

	/**
	 * virtual junction
	 * @param id
	 * @param type
	 * @param predecessor
	 * @param successor
	 * @param laneLink
	 */
	public Connection(String id, JunctionType type, PredecessorSuccessor predecessor, PredecessorSuccessor successor, ArrayList<LaneLink> laneLink) {
		this.id = id;
		this.type = type;
		this.predecessor = predecessor;
		this.successor = successor;
		this.laneLink = laneLink;
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

	public String getIncomingRoad() {
		return incomingRoad;
	}

	public void setIncomingRoad(String incomingRoad) {
		this.incomingRoad = incomingRoad;
	}

	public String getConnectingRoad() {
		return connectingRoad;
	}

	public void setConnectingRoad(String connectingRoad) {
		this.connectingRoad = connectingRoad;
	}

	public ContactPoint getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}

	public PredecessorSuccessor getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(PredecessorSuccessor predecessor) {
		this.predecessor = predecessor;
	}

	public PredecessorSuccessor getSuccessor() {
		return successor;
	}

	public void setSuccessor(PredecessorSuccessor successor) {
		this.successor = successor;
	}
}