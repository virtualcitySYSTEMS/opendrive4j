package object;

import road.Road;
import core._OpenDriveElement;
import geometry.STTransform;
import geometry._AbstractGeometry;
import lane.LaneValidity;
import geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class _AbstractObject extends _OpenDriveElement {

	private string name;
	private string id;
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