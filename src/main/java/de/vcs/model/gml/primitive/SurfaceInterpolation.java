package primitive;


/**
 * SurfaceInterpolation (Figure 20) is a list of codes that may be used to
 * identify the interpolation mechanisms specified by an application schema. Valid
 * values for "interpolation" include, but are not limited, to the following:
 * a) None (none) - the interior of the surface is not specified. The assumption
 * is that the surface follows the reference surface defined by the coordinate
 * reference system.
 * b) Planar (planar) - the interpolation method shall return points on a single
 * plane. The boundary in this case shall be contained within that plane.
 * c) Spherical (spherical), Elliptical (elliptical), Conic (conic) - the surface
 * is a section of a spherical, elliptical or conic surface.
 * d) TIN (tin) - the control points are organized into adjoining triangles, which
 * form small planar segments.
 * e) Parametric Curve (parametricCurve)  - the control points are organized into
 * a 2-dimensional grid and each cell within the grid is spanned by a surface
 * which shall be defined by a family of curves.
 * f) Polynomial Spline (polynomialSpline) - the control points are organized into
 * an irregular 2-dimensional grid and each cell within this grid is spanned by a
 * polynomial spline function.
 * g) Rational Spline (rationalSpline) - the control points are organized into an
 * irregular 2-dimensional grid and each cell within this grid is spanned by a
 * rational (quotient of polynomials) spline function.
 * h) Triangulated Spline (triangulatedSpline) - the control points are organized
 * into adjoining triangles, each of which is spanned by a polynomial spline
 * function.
 * If more than one interpolation description fits the method used, then the most
 * restrictive one will be used.
 * SurfaceInterpolation::
 * none
 * planar
 * spherical
 * elliptical
 * conic
 * tin
 * parametricCurve
 * polynomialSpline
 * rationalSpline
 * triangualtedSpline
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:26
 */
public class SurfaceInterpolation {

	public string none;
	public string planar;
	public string spherical;
	public string elliptical;
	public string conic;
	public string tin;
	public string parametricCurve;
	public string polynomialSpline;
	public string rationalSpline;
	public string triangulatedSpline;

	public SurfaceInterpolation(){

	}

}