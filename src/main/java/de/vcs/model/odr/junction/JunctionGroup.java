package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class JunctionGroup extends AbstractOpenDriveElement {

	private String name;
	private String id;
	private JunctionGroupType type;
	public ArrayList<JunctionReference> junctionReference;

	public JunctionGroup(){

	}

	public JunctionGroup(String name, String id, JunctionGroupType type, ArrayList<JunctionReference> junctionReference) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.junctionReference = junctionReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JunctionGroupType getType() {
		return type;
	}

	public void setType(JunctionGroupType type) {
		this.type = type;
	}
}