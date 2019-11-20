package coordinate;


/**
 * A Arc is defined by 3 points, and consists of the arc of the circle determined
 * by the 3 points, starting at the first, passing through the second and
 * terminating at the third. If the 3 points are co-linear, then the arc shall be
 * a 3-point line string, and will not be able to return values for center, radius,
 * start angle and end angle.
 * NOTE In the model, a Arc is a subclass of ArcString, being a trivial arc string
 * consisting of only one arc. This may be counter-intuitive in the sense that
 * subclasses are often thought of as more complex than their superclass (with
 * additional methods and attributes). A Arc is simpler than a ArcString in that
 * it has less data, but it is more complex in that it can return geometric
 * information such as "center", "start angle", and "end angle". This additional
 * computational complexity forces the subclassing to be the way it is. In
 * addition the "is type of" semantics works this way and not the other.
 * In its simplest representation, the three points in the controlPoint sequence
 * for an Arc shall consist of, in order, the initial point on the arc, some point
 * on the arc neither at the start or end, and the end point of the Arc.
 * Arc::controlPoint : PointArray = < startPoint : Position,
 *             midPoint : Position,
 *             endPoint : Position>
 * 
 * If additional points are given, then all points must lie on the circle defined
 * by any 3 non-colinear points in the control point array. All points shall lie
 * on the same circle, and shall be given in the controlPoint array in the order
 * in which they occur on the arc.
 * 
 * NOTE The use of the term "midPoint" for the center Position of the controlPoint
 * sequence is not meant to require that the Position be the geometric midpoint of
 * the arc. This is the best choice for this Position from a computational
 * stability perspective, but it is not absolutely necessary for the mathematics
 * to work.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class Arc extends ArcString ArcString {

	public Arc(){

	}

}