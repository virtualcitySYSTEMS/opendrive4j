package de.vcs.model.gml.coordinate;


import de.vcs.model.gml.primitive.CurveSegment;

/**
 * This variant of the arc simply stores the parameters of the second constructor
 * of the component Arcs and recalculates the other attributes of the standard arc.
 * The controlPoint sequence is similar to that in ArcString, but the midPoint
 * Position is not needed since it is to be calculated. The control point sequence
 * shall consist of the start and end points of each arc.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class ArcStringByBulge extends CurveSegment {

	public String bulge;
	public int numArc;
	public String normal;

	public ArcStringByBulge(){

	}

}