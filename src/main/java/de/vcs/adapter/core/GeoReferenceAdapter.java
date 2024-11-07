package de.vcs.adapter.core;

import de.vcs.model.odr.core.GeoReference;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

@XMLElements({
        @XMLElement(name = "geoReference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class GeoReferenceAdapter implements ObjectBuilder<GeoReference> {

    @Override
    public GeoReference createObject(QName name, Object o) throws ObjectBuildException {
        return new GeoReference();
    }

    @Override
    public void initializeObject(GeoReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("epsg").ifPresent(object::setEpsg);
        attributes.getValue("proj").ifPresent(object::setProj);
    }
}
