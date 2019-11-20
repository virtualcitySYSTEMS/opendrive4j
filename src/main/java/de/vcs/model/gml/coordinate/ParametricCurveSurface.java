package coordinate;


/**
 * The surface patches that make up the parametric curve surfaces,
 * ParametricCurveSurface (Figure 23), are all continuous families of curves,
 * given by a constructive function of the form:
 * surface(s,t): [a,b]´[c,d] ®DirectPosition
 * 
 * By fixing the value of either parameter, we have a one-parameter family of
 * curves.
 * ct(s) = cs(t) = surface(s,t)
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public abstract class ParametricCurveSurface extends SurfacePatch {

	public CurveInterpolation horizontalCurveType;
	public CurveInterpolation verticalCurveType;

	public ParametricCurveSurface(){

	}

}