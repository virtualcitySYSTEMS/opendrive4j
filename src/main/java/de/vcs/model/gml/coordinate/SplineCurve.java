package de.vcs.model.gml.coordinate;



/**
 * SplineCurve (Figure 19) acts as a root for subtypes of CurveSegment using some
 * version of spline, either polynomial or rational functions.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public abstract class SplineCurve extends CurveSegment {

	public integer degree;
	public string knot;
	public PointArray controlPoints;

	public SplineCurve(){

	}

}