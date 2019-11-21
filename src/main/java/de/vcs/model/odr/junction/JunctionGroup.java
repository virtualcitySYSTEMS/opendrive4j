package de.vcs.model.odr.junction;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class JunctionGroup extends _OpenDriveElement {

	public String name;
	public String id;
	public JunctionGroupType type;
	public JunctionReference junctionReference;
	public AdditionalData m_AdditionalData;

	public JunctionGroup(){

	}

}