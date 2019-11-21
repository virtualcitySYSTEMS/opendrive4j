package de.vcs.model.gml.primitive;

import de.vcs.model.gml.root.Boundary;

/**
 * The abstract class Primitive boundary is the root for the various return types
 * of the boundary operator for subtypes of Primitive. Since points have no
 * boundary, no special subclass is needed for their boundary.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public abstract class PrimitiveBoundary extends Boundary {

	public PrimitiveBoundary(){

	}

}