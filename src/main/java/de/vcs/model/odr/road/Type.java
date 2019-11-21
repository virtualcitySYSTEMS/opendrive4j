package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Type extends _OpenDriveElement {

	public RoadType type;
	public String country;
	public AdditionalData m_AdditionalData;
	public Speed speed;
	public SPosition linearReference;

	public Type(){

	}

}