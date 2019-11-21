package de.vcs.model.gml.primitive;


/**
 * Bearing is a data type used to represent direction in the coordinate reference
 * system. In a 2D coordinate reference system, this can be accomplished using a
 * "angle measured from true north" or a 2D vector point in that direction.  In a
 * 3D coordinate reference system, two angles or any 3D vector is possible.  If
 * both a set of angles and a vector are given, then they shall be consistent with
 * one another.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class Bearing {

	public String angle;
	public String direction;

	public Bearing(){

	}

}