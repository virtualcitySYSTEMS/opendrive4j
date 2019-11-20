package lane;

import  Geometry.Geometry root.GM_Object;
import geometry.STTransform;
import geometry._ParametricGeometry;
import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class RoadMark extends _OpenDriveElement {

	public RoadMarkType type;
	public RoadMarkWeight weight;
	public RoadMarkColor color;
	public string material;
	public double width;
	public LaneChange laneChange;
	public double height;
	public GM_Object geometry;
	public STTransform stTransform;
	public ExplicitRoadMark explicit;
	public _ParametricGeometry sway;
	public AdditionalData m_AdditionalData;

	public RoadMark(){

	}

}