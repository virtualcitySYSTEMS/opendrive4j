package coordinate;


/**
 * A Polygon (Figure 21) is a surface patch that is defined by a set of boundary
 * curves and an underlying surface to which these curves adhere. The default is
 * that the curves are coplanar and the polygon uses planar interpolation in its
 * interior.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class Polygon extends SurfacePatch {

	public SurfaceBoundary boundary;
	public Surface spanningSurface;

	public Polygon(){

	}

}