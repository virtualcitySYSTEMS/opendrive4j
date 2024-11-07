package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.Line;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class LineAdapter implements ObjectBuilder<Line> {

    @Override
    public Line createObject(QName name, Object o) throws ObjectBuildException {
        return new Line();
    }

    @Override
    public void buildChildObject(Line object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
