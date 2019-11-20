package coordinate;


/**
 * The data type Position is a union type consisting of either a DirectPosition or
 * of a reference to a Point from which a DirectPosition shall be obtained. The
 * use of this data type allows the identification of a position either directly
 * as a coordinate (variant direct) or indirectly as a reference to a Point
 * (variant indirect).
 * Position::direct [0,1] : DirectPosition;
 * Position::indirect [0,1] : PointRef;
 * 
 * Position:
 * {direct.isNull = indirect.isNotNull}
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Position {

	public DirectPosition direct;
	public PointRef indirect;

	public Position(){

	}

}