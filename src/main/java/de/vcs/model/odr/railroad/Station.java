package railroad;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Station extends _OpenDriveElement {

	public string name;
	public string id;
	public StationType type;
	public Platform platform;
	public AdditionalData m_AdditionalData;

	public Station(){

	}

}