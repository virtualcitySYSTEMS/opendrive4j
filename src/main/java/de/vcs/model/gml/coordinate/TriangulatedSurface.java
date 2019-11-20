package de.vcs.model.gml.coordinate;


/**
 * A TriangulatedSurface (Figure 21) is a PolyhedralSurface that is composed only
 * of triangles (Triangle). There is no restriction on how the triangulation is
 * derived.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class TriangulatedSurface extends PolyhedralSurface {

	public Triangle patch;

	public TriangulatedSurface(){

	}

}