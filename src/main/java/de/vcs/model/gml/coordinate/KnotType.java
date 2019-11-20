package de.vcs.model.gml.coordinate;


/**
 * A B-spline is uniform if and only if all knots are of multiplicity 1 and they
 * differ by a positive constant from the preceding knot. A B-spline is quasi-
 * uniform if and only if the knots are of multiplicity (degree+1) at the ends, of
 * multiplicity 1 elsewhere, and they differ by a positive constant from the
 * preceding knot. This code list is used to describe the distribution of knots in
 * the parameter space of various splines. The possible values are:
 * � uniform: the form of knots is appropriate for a uniform B-spline.
 * � quasiUniform: the form of knots is appropriate for a quasi-uniform B-spline.
 * � piecewiseBezier : the form of knots is appropriate for a piecewise Bezier
 * curve.
 * KnotType::
 * uniform : CharacterString
 * quasiUniform : CharacterString
 * piecewiseBezier : CharacterString
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class KnotType {

	public string uniform;
	public string quasiUniform;
	public string piecewiseBezier;

	public KnotType(){

	}

}