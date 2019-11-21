package de.vcs.model.odr.lane;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.geometry._AbstractGeometry;
import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class LaneSection extends _OpenDriveElement {

	public boolean singleSide;
	public SPosition linearReference;
	public _AbstractGeometry laneSectionGeometry;
	public AdditionalData m_AdditionalData;
	public Lane center;
	public Lane left;
	public Lane right;

	public LaneSection(){

	}

}