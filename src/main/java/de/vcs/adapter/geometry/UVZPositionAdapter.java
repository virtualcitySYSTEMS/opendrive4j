package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.UVZPosition;
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
        @XMLElement(name = "uvzPosition",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class UVZPositionAdapter implements ObjectBuilder<UVZPosition> {

    @Override
    public UVZPosition createObject(QName name, Object o) throws ObjectBuildException {
        return new UVZPosition();
    }

    @Override
    public void initializeObject(UVZPosition object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractODRGeometryAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("u").ifDouble(object::setU);
        attributes.getValue("v").ifDouble(object::setV);
        attributes.getValue("w").ifDouble(object::setZ);
    }

    @Override
    public void buildChildObject(UVZPosition object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractODRGeometryAdapter.setSuperAttributes(object, name, attributes, reader);
    }
}
