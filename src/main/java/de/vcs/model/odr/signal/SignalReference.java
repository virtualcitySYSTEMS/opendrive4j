package signal;

import geometry.SPosition;
import lane.LaneValidity;
import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class SignalReference extends _OpenDriveElement {

	public string id;
	public Orientation orientation;
	public SPosition linearReference;
	public LaneValidity validity;
	public AdditionalData m_AdditionalData;

	public SignalReference(){

	}

}