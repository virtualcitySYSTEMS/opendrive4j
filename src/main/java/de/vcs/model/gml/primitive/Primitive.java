package primitive;


/**
 * Primitive (Figure 8) is the abstract root class of the geometric primitives.
 * Its main purpose is to define the basic "boundary" operation that ties the
 * primitives in each dimension together. A geometric primitive (Primitive) is a
 * geometric object that is not decomposed further into other primitives in the
 * system. This includes curves and surfaces, even though they are composed of
 * curve segments and surface patches, respectively. This composition is a strong
 * aggregation: curve segments and surface patches cannot exist outside the
 * context of a primitive.
 * NOTE Most geometric primitives are decomposable infinitely many times. Adding a
 * centre point to a line may split that line into two separate lines. A new curve
 * drawn across a surface may divide that surface into two parts, each of which is
 * a surface. This is the reason that the normal definition of primitive as "non-
 * decomposable" is not plausible in a geometry model - the only non-decomposable
 * object in geometry is a point.
 * Any geometric object that is used to describe a feature is a collection of
 * geometric primitives. A collection of geometric primitives may or may not be a
 * geometric complex. Geometric complexes have additional properties such as
 * closure by boundary operations and mutually exclusive component parts.
 * Primitive and Complex share most semantics, in the meaning of operations,
 * attributes and associations. There is an exception in that a Primitive shall
 * not contain its boundary (except in the trivial case of Point where the
 * boundary is empty), while a Complex shall contain its boundary in all cases.
 * This means that if an instantiated object implements Object operations both as
 * Primitive and as a Complex, the semantics of each set theoretic operation is
 * determined by the its name resolution. Specifically, for a particular object
 * such as CompositeCurve, Primitive::contains (returns FALSE for end points) is
 * different from Complex::contains (returns TRUE for end points). Further, if
 * that object is cast as a Primitive value and as a Complex value, then the two
 * values need not be equal as Objects.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:25
 */
public abstract class Primitive extends Object {

	public OrientablePrimitive proxy;
	public Primitive containingPrimitive;

	public Primitive(){

	}

}