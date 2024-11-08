package de.vcs.model.odr.geometry;

import org.locationtech.jts.geom.Point;

public interface Visitor {
    Point visit(ParamPolynom poly);

    Point visit(Arc arc);

    Point visit(Polynom poly);

    Point visit(Spiral spiral);

    Point visit(Line line);


}
