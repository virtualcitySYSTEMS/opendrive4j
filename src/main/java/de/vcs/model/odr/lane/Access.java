package lane;

import geometry.STTransform;
import core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Access extends _OpenDriveElement {

	public AccessRule rule;
	public AccessRestriction restriction;
	public STTransform stTransform;

	public Access(){

	}

}