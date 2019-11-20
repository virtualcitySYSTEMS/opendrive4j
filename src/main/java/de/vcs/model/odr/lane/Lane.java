package lane;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:28
 */
public class Lane extends _OpenDriveElement {

	private int id;
	public LaneType type;
	public double level;
	public AdditionalData m_AdditionalData;
	public Material material;
	public Access access;
	public Speed speed;
	public Lane predecessor;
	public Lane successor;
	public Rule rule;
	public RoadMark roadMark;
	public Height height;

	public Lane(){

	}

}