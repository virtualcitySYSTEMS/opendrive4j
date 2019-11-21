package de.vcs.model.odr.object;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Object extends _OpenDriveElement _AbstractObject {

	public String subtype;
	public boolean dynamic;
	public RepeatedObject repeat;
	public AdditionalData m_AdditionalData;

	public Object(){

	}

}