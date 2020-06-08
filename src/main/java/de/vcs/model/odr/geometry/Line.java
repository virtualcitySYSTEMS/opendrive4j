package de.vcs.model.odr.geometry;

import org.locationtech.jts.geom.Point;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class Line extends AbstractSTGeometry {

    public Line() {
    }

    @Override
    public Point accept(Visitor v) {
        return v.visit(this);
    }
}