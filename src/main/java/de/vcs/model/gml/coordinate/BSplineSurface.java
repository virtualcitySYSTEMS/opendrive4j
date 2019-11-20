package coordinate;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:17
 */
public class BSplineSurface extends GriddedSurface GriddedSurface {

	public integer degree;
	public string knot;
	public boolean isPolynomial;
	public KnotType knotSpec;
	public BSplineSurfaceForm surfaceForm;

	public BSplineSurface(){

	}

}