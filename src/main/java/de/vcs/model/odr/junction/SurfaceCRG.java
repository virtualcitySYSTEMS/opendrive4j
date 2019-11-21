package de.vcs.model.odr.junction;

import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.core._OpenDriveElement;

import de.vcs.model.odr.junction.CRGMode;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class SurfaceCRG extends _OpenDriveElement {

	public String file;
	public CRGMode mode = CRGMode.global;
	public CRGPurpose purpose;
	public double zScale;
	public STTransform stTransform;

	public SurfaceCRG(){

	}

}