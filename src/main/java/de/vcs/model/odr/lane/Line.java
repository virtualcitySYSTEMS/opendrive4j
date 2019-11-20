package lane;

import geometry.STTransform;
import core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Line extends _OpenDriveElement {

	public double length;
	public double space;
	public RoadMarkRule rule;
	public double width;
	public RoadMarkColor color;
	public STTransform stTransform;

	public Line(){

	}

}