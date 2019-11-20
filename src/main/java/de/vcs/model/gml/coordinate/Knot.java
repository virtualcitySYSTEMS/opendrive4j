package de.vcs.model.gml.coordinate;


/**
 * Knot is used to control the constructive parameter space for spline curves and
 * surfaces. Each knot sequence is used for a dimension of the spline's parameter
 * space. Thus, in a surface spline, there will be two knot sequences, one for
 * each parameter (u, v). The ith, jth would be (ui, vj), where the original knot
 * sequences were (ui) and (vj). Each knot of a spline curve or surface is
 * described using a Knot.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Knot {

	public string value;
	public integer multiplicity;
	public string weight;

	public Knot(){

	}

}