package de.vcs.model.gml.coordinate;


/**
 * A LineString (Figure 16) consists of sequence of line segments, each having a
 * parameterization like the one for LineSegment (See 6.4.11). The class
 * essentially combines a Sequence<LineSegments> into a single object, with the
 * obvious savings of storage space.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class LineString extends CurveSegment {

	public PointArray controlPoint;

	public LineString(){

	}

}