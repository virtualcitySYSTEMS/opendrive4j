package de.vcs.adapter.railroad;

import de.vcs.model.odr.railroad.Partner;
import de.vcs.model.odr.railroad.Platform;
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
        @XMLElement(name = "platform",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class PlatformAdapter implements ObjectBuilder<Platform> {

    @Override
    public Platform createObject(QName name) throws ObjectBuildException {
        return new Platform();
    }

    @Override
    public void initializeObject(Platform object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
    }

    @Override
    public void buildChildObject(Platform object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "segment":
                    object.getSegments().add(reader.getObjectUsingBuilder(SegmentAdapter.class));
                    break;
            }
        }
    }
}
