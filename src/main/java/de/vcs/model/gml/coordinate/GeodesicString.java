package de.vcs.model.gml.coordinate;


import de.vcs.model.gml.primitive.CurveSegment;

/**
 * A GeodesicString consists of sequence of geodesic segments. The class
 * essentially combines a Sequence<Geodesic> into a single object, with the
 * obvious savings of storage space.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class GeodesicString extends CurveSegment {

	public PointArray controlPoint;

	public GeodesicString(){

	}

}