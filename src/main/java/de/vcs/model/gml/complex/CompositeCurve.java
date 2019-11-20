package complex;


/**
 * geometric composite curve, path
 * list of geometric curves such that the each geometric curve in the set
 * terminates at the start point of the subsequent curve in the list
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:05
 */
public class CompositeCurve {

	public Primitive element;
	public Primitive generator;
	public OrientableCurve generator;
	public Complex subComplex;

	public CompositeCurve(){

	}

}