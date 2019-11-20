package de.vcs.model.odr.junction;

import core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class PredecessorSuccessor extends _OpenDriveElement {

	public string elementType = road;
	public string elementId;
	public double elementS;
	public ElementDir elementDir;

	public PredecessorSuccessor(){

	}

}