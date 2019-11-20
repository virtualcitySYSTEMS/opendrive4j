package junction;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class JunctionGroup extends _OpenDriveElement {

	public string name;
	public string id;
	public JunctionGroupType type;
	public JunctionReference junctionReference;
	public AdditionalData m_AdditionalData;

	public JunctionGroup(){

	}

}