package de.vcs.model.gml.coordinate;


import de.vcs.model.gml.primitive.CurveSegment;

/**
 * A ArcString (Figure 17) is similar to a LineString except that the
 * interpolation is by circular arcs. Since it requires 3 points to determine a
 * circular arc, the controlPoints are treated as a sequence of overlapping sets
 * of 3 Positions, the start of each arc, some point between the start and end,
 * and the end of each arc. Since the end of each arc is the start of the next,
 * this Position is not repeated in the controlPoint sequence.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class ArcString extends CurveSegment {

	public int numArc;
	public PointArray controlPoints;

	public ArcString(){

	}

}