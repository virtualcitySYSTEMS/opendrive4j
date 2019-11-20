package junction;

import core._OpenDriveElement;
import core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class Junction extends _OpenDriveElement {

	public string name;
	public string id;
	public JunctionType type;
	public Connection connection;
	public Priority priority;
	public Controller controller;
	public Surface surface;
	public AdditionalData m_AdditionalData;

	public Junction(){

	}

}