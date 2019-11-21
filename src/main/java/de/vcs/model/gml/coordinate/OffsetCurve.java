package de.vcs.model.gml.coordinate;


import de.vcs.model.gml.primitive.CurveSegment;

/**
 * An offset curve is a curve at a constant distance from the basis curve. They
 * can be useful as a cheap and simple alternative to constructing curves that are
 * offsets by definition.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class OffsetCurve extends CurveSegment {

	public String distance;
	public String refDirection;
	public CurveSegment baseCurve;

	public OffsetCurve(){

	}

}