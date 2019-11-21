package de.vcs.model.gml.complex;


import de.vcs.model.gml.primitive.Primitive;
import de.vcs.model.gml.root.GMObject;

import java.util.ArrayList;

/**
 * geometric complex
 * set of disjoint geometric primitives such that the boundary of each primitive
 * can be represented as the union of other geometric primitives within the
 * complex
 * 
 * NOTE:  The geometric primitives in the set are mutually exclusive in the sense
 * that no point is interior to more than one primitive.  The set is closed under
 * boundary operations, meaning that for each element in the complex, there is a
 * collection (also a complex) of geometric primitives that represents the
 * boundary of that element.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:05
 */
public abstract class Complex extends GMObject {

	public ArrayList<Primitive> elements;
	public ArrayList<Complex> subComplexes;
	private boolean isMaximal;

	public Complex(){

	}

	public Complex(boolean isMaximal) {
		this.isMaximal = isMaximal;
	}

	public boolean isMaximal() {
		return isMaximal;
	}

	public void setMaximal(boolean maximal) {
		isMaximal = maximal;
	}
}