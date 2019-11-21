package de.vcs.model.odr.road;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.junction.CRGMode;
import de.vcs.model.odr.junction.CRGPurpose;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class SurfaceCRG extends _OpenDriveElement {

	public String file;
	public Direction orientation;
	public CRGMode mode;
	public CRGPurpose purpose;
	public double zScale;
	public SPosition sStart;
	public SPosition sEnd;
	public STTransform stTransform;

	public SurfaceCRG(){

	}

}