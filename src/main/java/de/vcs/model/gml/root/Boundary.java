package root;


/**
 * The abstract root data type for all the data types used to represent the
 * boundary of geometric objects is Boundary (Figure 7). Any subclass of Object
 * will use a subclass of Boundary to represent its boundary through the operation
 * Object::boundary. By the nature of geometry, boundary objects are cycles.
 * Boundary:
 * {isCycle() = TRUE}
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:32
 */
public abstract class Boundary {

	public Boundary(){

	}

}