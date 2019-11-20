package primitive;


/**
 * OrientableSurface consists of a surface and an orientation inherited from
 * OrientablePrimitive. If the orientation is "+", then the OrientableSurface is a
 * Surface. If the orientation is "-", then the OrientableSurface is a reference
 * to a Surface with an upNormal that reverses the direction for this
 * OrientableSurface, the sense of "the top of the surface" (see 6.4.33.2).
 * OrientableSurface:
 * {Orientation = "+" implies primitive = self};
 * {(Orientation = "-" and TransfiniteSet::contains(p : DirectPosition))
 *  implies (primitive.upNormal(p) = - self.upNormal(p))};
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public class OrientableSurface extends OrientablePrimitive {

	public OrientableSurface(){

	}

}