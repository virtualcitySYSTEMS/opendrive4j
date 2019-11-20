package complex;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:05
 */
public class CompositePoint {

	/**
	 * The attribute "position" shall be the DirectPosition of this Point.
	 * Point::position [1] : DirectPosition
	 * NOTE In most cases, the state of a Point is fully determined by its position
	 * attribute.  The only exception to this is if the Point has been subclassed to
	 * provide additional non-geometric information such as symbology.
	 */
	public DirectPosition position;
	public Primitive element;
	public Primitive generator;
	public Point generator;
	public Complex subComplex;

	public CompositePoint(){

	}

}