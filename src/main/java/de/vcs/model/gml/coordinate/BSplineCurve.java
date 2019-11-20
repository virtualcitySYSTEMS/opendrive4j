package coordinate;


/**
 * A B-spline (Figure 19) is a piecewise parametric polynomial or rational curve
 * described in terms of control points and basis functions. If the weights in the
 * knots are equal then it is a polynomial spline. If not, then it is a rational
 * function spline. If the Boolean "isPolynomial" is set to TRUE then the weights
 * shall all be set to 1. A B-spline curve is a piecewise Bézier curve if it is
 * quasi-uniform except that the interior knots have multiplicity "degree" rather
 * than having multiplicity one. In this subtype the knot spacing shall be 1.0,
 * starting at 0.0. A piecewise Bézier curve that has only two knots, 0.0, and 1.0,
 * each of multiplicity (degree+1), is equivalent to a simple Bézier curve.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class BSplineCurve extends SplineCurve SplineCurve {

	public boolean isPolynomial;
	public SplineCurveForm curveForm;
	public KnotType knotSpec;

	public BSplineCurve(){

	}

}