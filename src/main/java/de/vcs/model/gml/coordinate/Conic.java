package de.vcs.model.gml.coordinate;



/**
 * The type Conic (Figure 18) represents any general conic curve.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class Conic extends CurveSegment {

	public boolean shifted;
	public string eccentricity;
	public string semiLatusRectum;
	public string startConstrParam;
	public string endConstrParam;
	public AffinePlacement position;

	public Conic(){

	}

}