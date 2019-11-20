package lane;

import core._OpenDriveElement;
import geometry.SPosition;
import geometry._AbstractGeometry;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class LaneSection extends _OpenDriveElement {

	public boolean singleSide;
	public SPosition linearReference;
	public _AbstractGeometry laneSectionGeometry;
	public AdditionalData m_AdditionalData;
	public Lane center;
	public Lane left;
	public Lane right;

	public LaneSection(){

	}

}