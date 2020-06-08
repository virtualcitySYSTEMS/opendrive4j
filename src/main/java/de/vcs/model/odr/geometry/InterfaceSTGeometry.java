package de.vcs.model.odr.geometry;

import org.locationtech.jts.geom.Point;

public interface InterfaceSTGeometry {
    Point accept(Visitor v);
}
