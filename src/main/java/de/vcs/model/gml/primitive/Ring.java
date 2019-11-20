package primitive;

import complex.CompositeCurve;

/**
 * A Ring is used to represent a single connected component of a SurfaceBoundary.
 * It consists of a number of references to OrientableCurves connected in a cycle
 * (an object whose boundary is empty).
 * A Ring is structurally similar to a CompositeCurve in that the endPoint of each
 * OrientedCurve OrientableCurve in the sequence is the startPoint of the next
 * OrientableCurve in the Sequence. Since the sequence is circular, there is no
 * exception to this rule. Each ring, like all boundaries is a cycle and each ring
 * is simple.
 * Ring:
 * {isSimple() = TRUE}
 * {isCycle() = TRUE}
 * 
 * NOTE Even though each Ring is simple, the boundary need not be simple. The
 * easiest case of this is where one of the interior rings of a surface is tangent
 * to its exterior ring. Implementations may enforce stronger restrictions on the
 * interaction of boundary elements.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class Ring extends CompositeCurve {

	public Ring(){

	}

}