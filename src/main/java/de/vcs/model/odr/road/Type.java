package road;

import core.AdditionalData;
import core._OpenDriveElement;
import geometry.SPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Type extends _OpenDriveElement {

	public RoadType type;
	public CountryCode country;
	public AdditionalData m_AdditionalData;
	public Speed speed;
	public SPosition linearReference;

	public Type(){

	}

}