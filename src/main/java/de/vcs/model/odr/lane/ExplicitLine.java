package lane;

import geometry.STTransform;
import core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class ExplicitLine extends _OpenDriveElement {

	public double length;
	public RoadMarkRule rule;
	public double width;
	public STTransform stTransform;

	public ExplicitLine(){

	}

}