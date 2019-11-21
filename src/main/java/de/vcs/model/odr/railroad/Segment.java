package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Segment extends _OpenDriveElement {

	public String roadId;
	public PlatformSide side;
	public SPosition sStart;
	public SPosition sEnd;

	public Segment(){

	}

}