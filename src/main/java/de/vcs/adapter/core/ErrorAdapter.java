package de.vcs.adapter.core;

import de.vcs.model.odr.core.Error;
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
        @XMLElement(name = "error",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ErrorAdapter implements ObjectBuilder<Error> {

    @Override
    public Error createObject(QName name, Object o) throws ObjectBuildException {
        return new Error();
    }

    @Override
    public void initializeObject(Error object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("xyAbsolute").ifDouble(object::setXyAbsolute);
        attributes.getValue("zAbsolute").ifDouble(object::setzAbsolute);
        attributes.getValue("xyRelative").ifDouble(object::setXyRelative);
        attributes.getValue("zRelative").ifDouble(object::setzRelative);
    }
}
