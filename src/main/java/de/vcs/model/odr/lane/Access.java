package de.vcs.model.odr.lane;


import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Access extends _OpenDriveElement {

	public AccessRule rule;
	public AccessRestriction restriction;
	public STTransform stTransform;

	public Access(){

	}

}