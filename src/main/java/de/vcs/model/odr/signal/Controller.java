package de.vcs.model.odr.signal;

import de.vcs.model.odr.core._OpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

/**
 * A controller provides consistent states for a group of signals. This may be a
 * set of signals within a junction or a set of dynamic speed restrictions on a
 * motorway. The entire record consists of a header followed by a number of
 * dependency records.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Controller extends _OpenDriveElement {

	public String id;
	public String name;
	public int sequence;
	public Control control;
	public AdditionalData m_AdditionalData;

	public Controller(){

	}

}