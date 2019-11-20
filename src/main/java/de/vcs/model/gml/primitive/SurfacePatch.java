package de.vcs.model.gml.primitive;

/**
 * SurfacePatch (Figure 20) defines a homogeneous portion of a Surface. The
 * multiplicity of the association "Segmentation" (Figure 12) specifies that each
 * SurfacePatch shall be in at most one Surface.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:26
 */
public abstract class SurfacePatch {

	public integer numDerivativesOnBoundary;
	public SurfaceInterpolation interpolation;

	public SurfacePatch(){

	}

}