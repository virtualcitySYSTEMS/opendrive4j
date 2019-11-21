package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.junction.ElementDir;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class SideTrack extends _OpenDriveElement {

	public String id;
	public ElementDir dir;
	public SPosition linearReference;

	public SideTrack(){

	}

}