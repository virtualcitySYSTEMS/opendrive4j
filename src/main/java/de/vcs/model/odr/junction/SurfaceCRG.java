package junction;

import geometry.STTransform;
import core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class SurfaceCRG extends _OpenDriveElement {

	public string file;
	public CRGMode mode = global;
	public CRGPurpose purpose;
	public double zScale;
	public STTransform stTransform;

	public SurfaceCRG(){

	}

}