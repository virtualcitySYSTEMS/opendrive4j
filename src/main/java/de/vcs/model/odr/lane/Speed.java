package de.vcs.model.odr.lane;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Speed extends _OpenDriveElement {

	public double max;
	public String unit;
	public STTransform stTransform;

	public Speed(){

	}

}