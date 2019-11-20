package primitive;

import coordinate.DirectPosition;

/**
 * Point (Figure 9) is the basic data type for a geometric object consisting of
 * one and only one point.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class Point extends Primitive Primitive {

	/**
	 * The attribute "position" shall be the DirectPosition of this Point.
	 * Point::position [1] : DirectPosition
	 * NOTE In most cases, the state of a Point is fully determined by its position
	 * attribute.  The only exception to this is if the Point has been subclassed to
	 * provide additional non-geometric information such as symbology.
	 */
	public DirectPosition position;

	public Point(){

	}

}