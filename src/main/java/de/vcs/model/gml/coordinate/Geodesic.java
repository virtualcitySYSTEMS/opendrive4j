package de.vcs.model.gml.coordinate;



/**
 * A Geodesic consists of two distinct positions joined by a geodesic curve. The
 * control points of a Geodesic shall all lie on the geodesic between its start
 * point and end point. Between these two points, a geodesic curve defined from
 * the ellipsoid or geoid model used by the coordinate reference system may be
 * used to interpolate other positions. Any other point in the controlPoint array
 * must fall on this geodesic.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Geodesic extends GeodesicString {

	public Geodesic(){

	}

}