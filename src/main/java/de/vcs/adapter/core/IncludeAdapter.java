package de.vcs.adapter.core;

import de.vcs.model.odr.core.Include;
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
        @XMLElement(name = "include",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class IncludeAdapter implements ObjectBuilder<Include> {

    @Override
    public Include createObject(QName name) throws ObjectBuildException {
        return new Include();
    }

    @Override
    public void initializeObject(Include object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("file").ifPresent(object::setFile);
    }
}
