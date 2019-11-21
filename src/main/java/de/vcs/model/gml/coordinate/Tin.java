package de.vcs.model.gml.coordinate;



/**
 * A Tin (Figure 21) is a TriangulatedSurface that uses the Delaunay algorithm or
 * a similar algorithm complemented with consideration for breaklines, stoplines
 * and maximum length of triangle sides (Figure 22). These networks satisfy the
 * Delaunay criterion away from the modifications: For each triangle in the
 * network, the circle passing through its vertexes does not contain, in its
 * interior, the vertex of any other triangle.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Tin extends TriangulatedSurface {

	public String stopLines;
	public String breakLines;
	public String maxLength;
	public Position controlPoint;

	public Tin(){

	}

}