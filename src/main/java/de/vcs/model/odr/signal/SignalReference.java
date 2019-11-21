package de.vcs.model.odr.signal;

import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.object.Orientation;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class SignalReference extends _OpenDriveElement {

	public String id;
	public Orientation orientation;
	public SPosition linearReference;
	public LaneValidity validity;
	public AdditionalData m_AdditionalData;

	public SignalReference(){

	}

}