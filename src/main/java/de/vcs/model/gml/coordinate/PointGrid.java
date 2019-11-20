package de.vcs.model.gml.coordinate;



/**
 * Many of the geometric constructs in this International Standard require the use
 * of reference points which are organized into sequences or grids (sequences of
 * equal length sequences).
 * PointArray::column[21..*n] : Position;
 * PointGrid::row[21..*n] : PointArray;
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class PointGrid {

	public PointArray row;

	public PointGrid(){

	}

}