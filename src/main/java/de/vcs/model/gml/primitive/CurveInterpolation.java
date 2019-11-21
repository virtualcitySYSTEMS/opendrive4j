package de.vcs.model.gml.primitive;

/**
 * CurveInterpolation is a list of codes that may be used to identify the
 * interpolation mechanisms specified by an application schema. As a code list,
 * there is no intention of limiting the potential values of CurveInterpolation.
 * Subtypes of CurveSegment can be spawned directly through subclassing, or
 * indirectly by specifying an interpolation method and an associated
 * controlParameters record to support it. Valid meanings for "interpolation"
 * include, but are not limited, to the following:
 * a) Linear (linear) - the interpolation mechanism shall return DirectPositions
 * on a straight line between each consecutive pair of controlPoints.
 * b) Geodesic (geodesic) - the interpolation mechanism shall return
 * DirectPositions on a geodesic curve between each consecutive pair of
 * controlPoints. A geodesic curve is a curve of shortest length. The geodesic
 * shall be determined in the coordinate reference system of the Curve in which
 * the CurveSegment is used.
 * c) Circular arc by 3 points (circularArc3Points) - for each set of three
 * consecutive controlPoints, the middle one being an even offset from the
 * beginning of the sequence of control points, the interpolation mechanism shall
 * return DirectPositions on a circular arc passing from the first point through
 * the middle point to the third point. The sequence of control points shall have
 * an odd number of elements. Note: if the 3 points are co-linear, the circular
 * arc becomes a straight line.
 * d) Circular arc by 2 points and bulge factor (circularArc2PointWithBulge) - for
 * each consecutive pair of controlPoints, the interpolation mechanism shall
 * return DirectPositions on a circular arc passing from the first controlPoint to
 * the second controlPoint, such that the associated control parameter determines
 * the offset of the center of the arc from the center point of the chord,
 * positive for leftward and negative for rightward. This form shall only be used
 * in 2 dimensions because of the restricted nature of the definition technique.
 * e) Elliptical arc (elliptical) - for each set of four consecutive controlPoints,
 * the interpolation mechanism shall return DirectPositions on an elliptical arc
 * passing from the first controlPoint through the middle controlPoints in order
 * to the fourth controlPoint. Note: if the 4 controlPoints are co-linear, the arc
 * becomes a straight line. If the 4 controlPoints are on the same circle, the arc
 * becomes a circular one.
 * f) Clothoid (clothoid) - uses a Cornu's spiral or clothoid interpolation.
 * g) Conic arc (conic) - same as elliptical arc but using 5 consecutive
 * controlPoints to determine a conic section.
 * h) Polynomial Spline (polynomialSpline) - the controlPoints are ordered as in a
 * line-String, but they are spanned by a polynomial spline function. Normally,
 * the degree of continuity is determined by the degree of the polynomials chosen.
 * 
 * i) Cubic spline (cubicSpline) - the control points are interpolated using
 * initial tangents and cubic polynomials, a form of degree 3 polynomial spline.
 * j) Rational Spline (rationalSpline) - the controlPoints are ordered as in a
 * line String, but they are spanned by a rational (quotient of polynomials)
 * spline function. Normally, the degree of continuity is determined by the degree
 * of the polynomials chosen.
 * This list shall be implemented by a code list, and may vary in actual values
 * from the above Strings.
 * CurveInterpolation::
 * linear
 * geodesic
 * circularArc3Points
 * circularArc2PointWithBulge
 * elliptical
 * clothoid
 * conic
 * polynomialSpline
 * cubicSpline
 * rationalSpline
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class CurveInterpolation {

	public String linear;
	public String geodesic;
	public String circularArc3Points;
	public String circularArc2PointWithBulge;
	public String elliptical;
	public String clothoid;
	public String conic;
	public String polynomialSpline;
	public String cubicSpline;
	public String rationalSpline;

	public CurveInterpolation(){

	}

}