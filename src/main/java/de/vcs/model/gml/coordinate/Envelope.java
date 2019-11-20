package de.vcs.model.gml.coordinate;



/**
 * Envelope is often referred to as a minimum bounding box or rectangle.
 * Regardless of dimension, a Envelope can be represented without ambiguity as two
 * direct positions (coordinate points). To encode a Envelope, it is sufficient to
 * encode these two points. This is consistent with all of the data types in this
 * standard, their state is represented by their publicly accessible attributes.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Envelope {

	/**
	 * A coordinate consisting of all maximal values of the ordinates of all points
	 * within the Envelope.
	 * The "upperCorner" of a Envelope is a coordinate position consisting of all the
	 * maximal ordinates for each dimension for all points within the Envelope.
	 * Envelope::upperCorner : DirectPosition
	 */
	public DirectPosition upperCorner;
	/**
	 * A coordinate consisting of all minimal values of the ordinates of all points
	 * within the Envelope.
	 * The "lowerCorner" of a Envelope is a coordinate position consisting of all the
	 * minimal ordinates for each dimension for all points within the Envelope.
	 * Envelope::lowerCorner : DirectPosition
	 */
	public DirectPosition lowerCorner;

	public Envelope(){

	}

}