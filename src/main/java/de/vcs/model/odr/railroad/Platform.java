package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Platform extends _OpenDriveElement {

	public String name;
	public String id;
	public Segment segment;
	public AdditionalData m_AdditionalData;

	public Platform(){

	}

}