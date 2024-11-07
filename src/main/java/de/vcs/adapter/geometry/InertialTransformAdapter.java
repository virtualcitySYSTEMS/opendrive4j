package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.InertialTransform;
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
        @XMLElement(name = "offset",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class InertialTransformAdapter implements ObjectBuilder<InertialTransform> {

    @Override
    public InertialTransform createObject(QName name, Object o) throws ObjectBuildException {
        return new InertialTransform();
    }

    @Override
    public void initializeObject(InertialTransform object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractTransformationAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("xOffset").ifDouble(object::setxOffset);
        attributes.getValue("yOffset").ifDouble(object::setyOffset);
        attributes.getValue("zOffset").ifDouble(object::setzOffset);
    }
}
