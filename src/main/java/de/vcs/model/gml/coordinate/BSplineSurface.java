package de.vcs.model.gml.coordinate;



/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class BSplineSurface extends GriddedSurface {

	public int degree;
	public String knot;
	public boolean isPolynomial;
	public KnotType knotSpec;
	public BSplineSurfaceForm surfaceForm;

	public BSplineSurface(){

	}

}