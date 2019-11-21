package de.vcs.model.odr.lane;

import  de.vcs.model.gml.root.Object;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.geometry._ParametricGeometry;
import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class RoadMark extends _OpenDriveElement {

	public RoadMarkType type;
	public RoadMarkWeight weight;
	public RoadMarkColor color;
	public String material;
	public double width;
	public LaneChange laneChange;
	public double height;
	public Object geometry;
	public STTransform stTransform;
	public ExplicitRoadMark explicit;
	public _ParametricGeometry sway;
	public AdditionalData m_AdditionalData;

	public RoadMark(){

	}

}