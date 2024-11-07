package de.vcs.adapter.signal;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.signal.Reference;
import de.vcs.model.odr.signal.SignalType;
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
        @XMLElement(name = "reference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ReferenceAdapter implements ObjectBuilder<Reference> {

    @Override
    public Reference createObject(QName name, Object o) throws ObjectBuildException {
        return new Reference();
    }

    @Override
    public void initializeObject(Reference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        TextContentChecker.check(attributes.getValue("elementType"), SignalType.class, object::setElementType);
        attributes.getValue("elementId").ifPresent(object::setElementId);
        attributes.getValue("type").ifPresent(object::setType);
    }
}
