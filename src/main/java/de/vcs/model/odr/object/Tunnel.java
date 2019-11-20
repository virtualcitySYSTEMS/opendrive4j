package object;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Tunnel extends _OpenDriveElement _AbstractObject {

	public TunnelType type;
	public boolean lighting;
	public boolean daylight;
	public AdditionalData m_AdditionalData;

	public Tunnel(){

	}

}