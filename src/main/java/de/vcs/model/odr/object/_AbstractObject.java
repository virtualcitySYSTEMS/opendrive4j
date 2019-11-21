package de.vcs.model.odr.object;

import de.vcs.model.odr.road.Road;
import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.geometry._AbstractGeometry;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class _AbstractObject extends _OpenDriveElement {

	private String name;
	private String id;
	private ObjectType type;
	private double validLength;
	private Orientation orientation;
	private double length;
	private double height;
	private double width;
	private double radius;
	public Road m_Road;
	public STTransform stTransform;
	public _AbstractGeometry geometry;
	public Material material;
	public LaneValidity validity;
	public SPosition linearReference;

	public _AbstractObject(){

	}

}