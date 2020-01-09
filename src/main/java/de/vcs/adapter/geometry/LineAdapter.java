package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.Line;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;

import javax.xml.namespace.QName;

public class LineAdapter implements ObjectBuilder<Line> {

    @Override
    public Line createObject(QName name) throws ObjectBuildException {
        return new Line();
    }
}
