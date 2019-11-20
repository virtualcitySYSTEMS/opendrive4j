package de.vcs.model.gml.coordinate;



/**
 * Same as Arc, but closed to form a full circle. The "start" and "end" bearing
 * are equal and shall be the bearing for the first controlPoint listed.
 * NOTE This still requires at least 3 distinct non-co-linear points to be
 * unambiguously defined. The arc is simply extended until the first point is
 * encountered.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class Circle extends Arc {

	public Circle(){

	}

}