package de.vcs.model.gml.coordinate;



/**
 * Cubic splines are similar to line strings in that they are a sequence of
 * segments each with its own defining function. A cubic spline uses the control
 * points and a set of derivative parameters to define a piecewise 3rd degree
 * polynomial interpolation. Unlike line-strings, the parameterization by arc
 * length is not necessarily still a polynomial. Splines have two
 * parameterizations that are used in this standard, the defining one
 * (constructive parameter) and the one that has been reparameterized by arc
 * length to satisfy the requirements in GenericCurve.
 * The function describing the curve must be C2, that is, have a continuous 1st
 * and 2nd derivative at all points, and pass through the controlPoints in the
 * order given. Between the control points, the curve segment is defined by a
 * cubic polynomial. At each control point, the polynomial changes in such a
 * manner that the 1st and 2nd derivative vectors are the same from either side.
 * The control parameters record must contain vectorAtStart, and vectorAtEnd which
 * are the unit tangent vectors at controlPoint[1] and controlPoint[n] where n =
 * controlPoint.count.
 * The restriction on "vectorAtStart" and "vectorAtEnd" reduce these sequences to
 * a single tangent vector each.
 * CubicSpline::vectorAtStart : Vector \\ "degree - 2" is 1
 * CubicSpline::vectorAtEnd : Vector \\ "degree - 2" is 1
 * 
 * NOTE The actual implementation of the cubic polynomials varies, but the curve
 * so generated is guaranteed to be unique. See [2], [10], [12], [18], and [19] in
 * the bibliography for examples of implementations.
 * The interpolation mechanism for a CubicSpline is "cubicSpline".
 * CubicSpline::interpolation : InterpolationMethod = "cubicSpline"
 * 
 * The degree for a CubicSpline is "3".
 * CubicSpline::degree : Integer = "3"
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class CubicSpline extends PolynomialSpline PolynomialSpline {

	public CubicSpline(){

	}

}