package road;

import core._OpenDriveElement;
import geometry.SPosition;
import geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class SurfaceCRG extends _OpenDriveElement {

	public string file;
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