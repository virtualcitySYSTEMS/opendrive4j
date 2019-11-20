package de.vcs.model.gml.primitive;


/**
 * OrientableCurve consists of a curve and an orientation inherited from
 * OrientablePrimitive. If the orientation is "+", then the OrientableCurve is a
 * Curve. If the orientation is "-", then the OrientableCurve is related to
 * another Curve with a parameterization that reverses the sense of the curve
 * traversal.
 * OrientableCurve:
 * {Orientation = "+" implies primitive = self};
 * {Orientation = "-" implies
 * primitive.parameterization(length()-s) = parameterization(s)};
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class OrientableCurve extends OrientablePrimitive OrientablePrimitive {

	public OrientableCurve(){

	}

}