package de.vcs.model.gml.complex;


import de.vcs.model.gml.primitive.OrientableSurface;
import de.vcs.model.gml.primitive.Primitive;

/**
 * 4.51 geometric composite surface
 * set of geometric surfaces adjoining one another along common boundary geometric
 * curves
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:05
 */
public class CompositeSurface {

	public Primitive element;
	public Primitive generator;
	public OrientableSurface generator;
	public Complex subComplex;

	public CompositeSurface(){

	}

}