package de.vcs.model.gml.primitive;


/**
 * Curve (Figure 11) is a descendent subtype of Primitive through
 * OrientablePrimitive. It is the basis for 1-dimensional geometry. A curve is a
 * continuous image of an open interval and so could be written as a parameterized
 * function such as c(t):(a, b)�En where "t" is a real parameter and En is
 * Euclidean space of dimension n (usually 2 or 3, as determined by the coordinate
 * reference system). Any other parameterization that results in the same image
 * curve, traced in the same direction, such as any linear shifts and positive
 * scales such as e(t) = c(a + t(b-a)):(0,1) �En, is an equivalent representation
 * of the same curve. For the sake of simplicity, Curves should be parameterized
 * by arc length, so that the parameterization operation inherited from
 * GenericCurve (see 6.4.7) will be valid for parameters between 0 and the length
 * of the curve.
 * Curves are continuous, connected, and have a measurable length in terms of the
 * coordinate system. The orientation of the curve is determined by this
 * parameterization, and is consistent with the tangent function, which
 * approximates the derivative function of the parameterization and shall always
 * point in the "forward" direction. The parameterization of the reversal of the
 * curve defined by c(t):(a, b)�En would be defined by a function of the form s(t)
 * = c(a + b - t):(a, b)�En.
 * A curve is composed of one or more curve segments. Each curve segment within a
 * curve may be defined using a different interpolation method. The curve segments
 * are connected to one another, with the end point of each segment except the
 * last being the start point of the next segment in the segment list.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class Curve extends OrientableCurve {

	public CurveSegment segment;

	public Curve(){

	}

}