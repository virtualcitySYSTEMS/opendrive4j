package de.vcs.model.gml.coordinate;


import de.vcs.model.gml.primitive.Surface;

/**
 * A PolyhedralSurface (Figure 21) is a Surface composed of polygon surfaces
 * (Polygon) connected along their common boundary curves.  This differs from
 * Surface only in the restriction on the types of surface patches acceptable.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class PolyhedralSurface extends Surface {

	public Polygon patch;

	public PolyhedralSurface(){

	}

}