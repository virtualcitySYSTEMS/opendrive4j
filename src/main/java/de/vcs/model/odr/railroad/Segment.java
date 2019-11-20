package railroad;

import core._OpenDriveElement;
import geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Segment extends _OpenDriveElement {

	public string roadId;
	public PlatformSide side;
	public SPosition sStart;
	public SPosition sEnd;

	public Segment(){

	}

}