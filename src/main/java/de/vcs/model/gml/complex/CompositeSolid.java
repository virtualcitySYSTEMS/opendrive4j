package de.vcs.model.gml.complex;


import de.vcs.model.gml.primitive.Primitive;
import de.vcs.model.gml.primitive.Solid;

/**
 * 4.50 geometric composite solid
 * set of geometric solids adjoining one another along common boundary geometric
 * surfaces
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:05
 */
public class CompositeSolid {

	public Primitive element;
	public Primitive generator;
	public Solid generator;
	public Complex subComplex;

	public CompositeSolid(){

	}

}