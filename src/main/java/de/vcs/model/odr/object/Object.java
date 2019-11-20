package object;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Object extends _OpenDriveElement _AbstractObject {

	public string subtype;
	public t_yesNo dynamic;
	public RepeatedObject repeat;
	public AdditionalData m_AdditionalData;

	public Object(){

	}

}