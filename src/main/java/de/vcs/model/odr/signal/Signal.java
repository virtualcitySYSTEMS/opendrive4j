package de.vcs.model.odr.signal;

import de.vcs.model.odr.object.Orientation;
import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.geometry.SPosition;
import de.vcs.model.odr.geometry.STTransform;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Signal extends _OpenDriveElement {

	public String id;
	public String name;
	public boolean dynamic;
	public Orientation orientation;
	public String country;
	public String countryRevision;
	public String type;
	public String subtype;
	public double value;
	public String unit;
	public double height;
	public double width;
	public String text;
	public LaneValidity validity;
	public Dependency dependency;
	public Reference reference;
	public AdditionalData m_AdditionalData;
	public SPosition linearReference;
	public STTransform stTransform;

	public Signal(){

	}

}