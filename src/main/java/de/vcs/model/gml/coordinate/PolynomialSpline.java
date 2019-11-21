package de.vcs.model.gml.coordinate;



/**
 * An "nth degree" polynomial spline shall be defined piecewise as an n-degree
 * polynomial, with up to Cn-1 continuity at the control points where the defining
 * polynomial changes. This level of continuity is controlled by the attribute
 * numDerivativesInterior. Parameters shall include directions for as many as
 * degree - 2 derivatives of the polynomial at the start and end point of the
 * segment. Linestring is equivalent to a 1st degree polynomial spline. It has
 * simple continuity at the controlPoints (C0), but does not require derivative
 * information (degree - 2 = -1).
 * NOTE The major difference between the polynomial splines and the b-splines
 * (basis splines) is that polynomial splines pass through their control points,
 * making the control point and sample point array identical.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class PolynomialSpline extends SplineCurve {

	public String vectorAtStart;
	public String vectorAtEnd;

	public PolynomialSpline(){

	}

}