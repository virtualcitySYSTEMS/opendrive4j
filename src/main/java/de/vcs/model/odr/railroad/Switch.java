package railroad;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Switch extends _OpenDriveElement {

	public string name;
	public string id;
	public SwitchPosition position;
	public MainTrack mainTrack;
	public SideTrack sideTrack;
	public Partner partner;
	public AdditionalData m_AdditionalData;

	public Switch(){

	}

}