package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.Spiral;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class SpiralAdapter implements ObjectBuilder<Spiral> {

    @Override
    public Spiral createObject(QName name) throws ObjectBuildException {
        return new Spiral();
    }

    @Override
    public void initializeObject(Spiral object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("curvStart").ifDouble(object::setCurvStart);
        attributes.getValue("curvEnd").ifDouble(object::setCurvEnd);
    }

    @Override
    public void buildChildObject(Spiral object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
