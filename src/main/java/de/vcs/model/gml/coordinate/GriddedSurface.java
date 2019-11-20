package coordinate;


/**
 * The GriddedSurface (Figure 23) is a ParametricCurveSurface defined from a
 * rectangular grid in the parameter space. The rows from this grid are control
 * points for horizontal surface curves; the columns are control points for
 * vertical surface curves. The working assumption is that for a pair of
 * parametric coordinates (s, t), that the horizontal curves for each integer
 * offset are calculated and evaluated at "s". This defines a sequence of control
 * points:
 * <cn(s) : s = 1 ? columns>
 * 
 * From this sequence, a vertical curve is calculated for "s," and evaluated at
 * "t". In most cases, the order of calculation (horizontal-vertical versus
 * vertical-horizontal) does not make a difference. Where it does, the horizontal-
 * vertical order shall be the one used.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class GriddedSurface extends ParametricCurveSurface ParametricCurveSurface {

	public integer rows;
	public integer columns;
	public PointGrid controlPoint;

	public GriddedSurface(){

	}

}