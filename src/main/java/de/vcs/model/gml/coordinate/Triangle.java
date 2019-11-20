package coordinate;


/**
 * A Triangle is a planar Polygon defined by 3 corners; that is, a Triangle would
 * be the result of a constructor of the form:
 * Polygon(LineString(<P1, P2, P3, P1>))
 * 
 * where P1, P2, and P3 are three Positions. Triangles have no holes. Triangle
 * shall be used to construct TriangulatedSurfaces.
 * 
 * NOTE The points in a triangle can be located in terms of their corner points by
 * defining a set of barycentric coordinates, three nonnegative numbers c1, c2,
 * and c3 such that c1+ c2 + c3 = 1.0. Then, each point P in the triangle can be
 * expressed for some set of barycentric coordinates as:
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Triangle extends Polygon {

	public Position corners;

	public Triangle(){

	}

}