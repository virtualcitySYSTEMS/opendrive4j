package de.vcs.model.gml.coordinate;



/**
 * Clothoid (Figure 19) implements the clothoid (or Cornu's spiral), which is a
 * plane curve whose curvature is a fixed function of its length.
 * This geometry is mainly used as a transition curve between curves of type
 * straight line/circular arc or circular arc/circular arc.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class Clothoid extends CurveSegment {

	public string scaleFactor;
	public string startParameter;
	public string endParameter;
	public AffinePlacement refLocation;

	public Clothoid(){

	}

}