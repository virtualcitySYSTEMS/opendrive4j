package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry._ParametricGeometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class LateralProfile extends _OpenDriveElement {

	public AdditionalData m_AdditionalData;
	public _ParametricGeometry superElevation;
	public _ParametricGeometry shape;

	public LateralProfile(){

	}

}