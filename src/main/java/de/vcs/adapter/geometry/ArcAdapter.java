package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.Arc;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class ArcAdapter implements ObjectBuilder<Arc> {

    @Override
    public Arc createObject(QName name) throws ObjectBuildException {
        return new Arc();
    }

    @Override
    public void initializeObject(Arc object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("curvature").ifDouble(object::setCurvature);
    }

    @Override
    public void buildChildObject(Arc object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
