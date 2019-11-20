package de.vcs.model.gml.primitive;

/**
 * CurveSegment defines a homogeneous segment of a Curve. Each CurveSegment shall
 * be in, at most, one Curve.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public abstract class CurveSegment {

	public integer numDerivativesAtStart;
	public integer numDerivativesAtEnd;
	public integer numDerivativeInterior;
	public CurveInterpolation interpolation;

	public CurveSegment(){

	}

}