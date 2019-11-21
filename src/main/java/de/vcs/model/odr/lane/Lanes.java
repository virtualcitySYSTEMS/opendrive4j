package de.vcs.model.odr.lane;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.geometry.Polynom;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lanes extends _OpenDriveElement {

	public AdditionalData m_AdditionalData;
	public Polynom laneOffset;
	public LaneSection laneSection;

	public Lanes(){

	}

}