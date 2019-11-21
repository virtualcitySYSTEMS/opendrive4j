package de.vcs.model.odr.lane;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Material extends _OpenDriveElement {

	public String surface;
	public double friction;
	public double roughness;
	public STTransform stTransform;

	public Material(){

	}

}