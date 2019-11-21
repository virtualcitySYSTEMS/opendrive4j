package de.vcs.model.odr.junction;

import de.vcs.model.odr.core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class PredecessorSuccessor extends _OpenDriveElement {

	public String elementType = "road";
	public String elementId;
	public double elementS;
	public ElementDir elementDir;

	public PredecessorSuccessor(){

	}

}