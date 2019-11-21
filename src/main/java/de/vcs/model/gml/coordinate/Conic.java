package de.vcs.model.gml.coordinate;


import de.vcs.model.gml.primitive.CurveSegment;

/**
 * The type Conic (Figure 18) represents any general conic curve.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class Conic extends CurveSegment {

	public boolean shifted;
	public String eccentricity;
	public String semiLatusRectum;
	public String startConstrParam;
	public String endConstrParam;
	public AffinePlacement position;

	public Conic(){

	}

}