package primitive;

import complex.CompositeSurface;

/**
 * A Shell is used to represent a single connected component of a SolidBoundary.
 * It consists of a number of references to OrientableSurfaces connected in a
 * topological cycle (an object whose boundary is empty). Unlike a Ring, a Shell's
 * elements have no natural sort order. Like Rings, Shells are simple.
 * Shell:
 * {isSimple() = TRUE}
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class Shell extends CompositeSurface {

	public Shell(){

	}

}