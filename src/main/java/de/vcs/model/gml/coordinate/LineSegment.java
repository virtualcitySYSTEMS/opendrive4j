package de.vcs.model.gml.coordinate;



/**
 * A LineSegment consists of two distinct DirectPositions (the startPoint and
 * endPoint) joined by a straight line. Thus its interpolation attribute shall be
 * "linear". The default GenericCurve::parameterization = c(s) is:
 * (L : Distance) = endParam - startParam
 * c(s) = ControlPoint[1]+((s-startParam)/L)*(ControlPoint[2]-ControlPoint[1])
 * 
 * Any other point in the controlPoint array must fall on this line. The control
 * points of a LineSegment shall all lie on the straight line between its start
 * point and end point. Between these two points, other positions may be
 * interpolated linearly.
 * NOTE The linear interpolation, given using a constructive parameter t, 0 � t �
 * 1.0, where c(o) = c.startPoint() and c(1)=c.endPoint(), is:
 * 
 * c(t) = t c(1)  + (1-t) c(0)
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:18
 */
public class LineSegment extends LineString LineString {

	public LineSegment(){

	}

}