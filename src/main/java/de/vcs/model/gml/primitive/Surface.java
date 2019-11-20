package de.vcs.model.gml.primitive;


/**
 * Surface (Figure 12) a subclass of Primitive and is the basis for 2-dimensional
 * geometry. Unorientable surfaces such as the M�bius band are not allowed. The
 * orientation of a surface chooses an "up" direction through the choice of the
 * upward normal, which, if the surface is not a cycle, is the side of the surface
 * from which the exterior boundary appears counterclockwise. Reversal of the
 * surface orientation reverses the curve orientation of each boundary component,
 * and interchanges the conceptual "up" and "down" direction of the surface. If
 * the surface is the boundary of a solid, the "up" direction is usually outward.
 * For closed surfaces, which have no boundary, the up direction is that of the
 * surface patches, which must be consistent with one another. Its included
 * SurfacePatches describe the interior structure of a Surface.
 * NOTE Other than the restriction on orientability, no other "validity" condition
 * is required for Surface.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:26
 */
public class Surface extends OrientableSurface {

	public SurfacePatch patch;

	public Surface(){

	}

}