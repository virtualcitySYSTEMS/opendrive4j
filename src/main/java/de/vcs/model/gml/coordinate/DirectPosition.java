package coordinate;


/**
 * DirectPosition object data types (Figure 14) hold the coordinates for a
 * position within some coordinate reference system. The coordinate reference
 * system is described in ISO 19111. Since DirectPositions, as data types, will
 * often be included in larger objects (such as Objects) that have references to
 * ISO19111::SC_CRS, the DirectPosition::cordinateReferenceSystem may be left NULL
 * if this particular DirectPosition is included in a larger object with such a
 * reference to a SC_CRS. In this case, the DirectPosition::
 * cordinateReferenceSystem is implicitly assumed to take on the value of the
 * containing object's SC_CRS.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class DirectPosition {

	public string coordinate;
	public integer dimension;

	public DirectPosition(){

	}

}