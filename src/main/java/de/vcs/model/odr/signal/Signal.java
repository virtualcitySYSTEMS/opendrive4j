package signal;

import road.CountryCode;
import core.Unit;
import core._OpenDriveElement;
import lane.LaneValidity;
import core.AdditionalData;
import geometry.SPosition;
import geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Signal extends _OpenDriveElement {

	public string id;
	public string name;
	public boolean dynamic;
	public Orientation orientation;
	public CountryCode country;
	public string countryRevision;
	public string type;
	public string subtype;
	public double value;
	public Unit unit;
	public double height;
	public double width;
	public string text;
	public LaneValidity validity;
	public Dependency dependency;
	public Reference reference;
	public AdditionalData m_AdditionalData;
	public SPosition linearReference;
	public STTransform stTransform;

	public Signal(){

	}

}