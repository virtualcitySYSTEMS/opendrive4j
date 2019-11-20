package de.vcs.model.gml.coordinate;



/**
 * This code list is used to indicate which sort of curve may be approximated by a
 * particular B-spline. The potential values are:
 * -- polylineform: a connected sequence of line segments represented by a 1
 * degree B-spline (a line string).
 * -- circularArc: an arc of a circle or a complete circle.
 * -- ellipticArc: an arc of an ellipse or a complete ellipse.
 * -- parabolicArc: an arc of a finite length of a parabola.
 * -- hyperbolicArc: an arc of a finite length of one branch of a hyperbola.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class SplineCurveForm {

	public string polylineForm;
	public string circularArc;
	public string ellipticArc;
	public string parabolicArc;
	public string hyperbolicArc;

	public SplineCurveForm(){

	}

}