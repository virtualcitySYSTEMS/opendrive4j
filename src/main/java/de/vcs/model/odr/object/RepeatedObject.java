package de.vcs.model.odr.object;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class RepeatedObject extends _OpenDriveElement {

	public double length;
	public double distance;
	public double heightStart;
	public double heightEnd;
	public double widthStart;
	public double widthEnd;
	public double lengthStart;
	public double lengthEnd;
	public double radiusStart;
	public double radiusEnd;
	public SPosition linearReference;
	public SPosition start;
	public SPosition end;

	public RepeatedObject(){

	}

}