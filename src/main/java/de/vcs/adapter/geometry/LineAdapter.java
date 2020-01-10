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
    public Line createObject(QName name) throws ObjectBuildException {
        return new Line();
    }

    @Override
    public void initializeObject(Line object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.setSuperAttributes(object, name, attributes, reader);
    }

    @Override
    public void buildChildObject(Line object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
