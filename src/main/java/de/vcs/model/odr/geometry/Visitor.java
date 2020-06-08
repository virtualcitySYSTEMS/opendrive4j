package de.vcs.model.odr.geometry;

import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;

public interface Visitor {
    Point visit(ParamPolynom poly);

    Point visit(Line line);

    Point visit(Polynom arc);

    Point visit(Spiral spiral);

    Point visit(Polygon poly);

}
