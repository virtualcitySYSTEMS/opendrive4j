package de.vcs.model.gml.root;

import de.vcs.model.odr.geometry.InertialTransform;
import de.vcs.model.odr.geometry._AbstractGeometry;

/**
 * Object (Figure 6) is the root class of the geometric object taxonomy and
 * supports interfaces common to all geographically referenced geometric objects.
 * Object instances are sets of direct positions in a particular coordinate
 * reference system. A Object can be regarded as an infinite set of points that
 * satisfies the set operation interfaces for a set of direct positions,
 * TransfiniteSet<DirectPosition>. Since an infinite collection class cannot be
 * implemented directly, a Boolean test for inclusion shall be provided by the
 * Object interface. This international standard concentrates on vector geometry
 * classes, but future work may use Object as a root class without modification.
 * NOTE As a type, Object does not have a well-defined default state or value
 * representation as a data type. Instantiated subclasses of Object will.
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:50:32
 */
public abstract class Object extends _AbstractGeometry {

	public InertialTransform inertialTransform;

	public Object(){

	}

}