package de.vcs.adapter.railroad;

import de.vcs.model.odr.railroad.Partner;
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
        @XMLElement(name = "partner",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class PartnerAdapter implements ObjectBuilder<Partner> {

    @Override
    public Partner createObject(QName name) throws ObjectBuildException {
        return new Partner();
    }

    @Override
    public void initializeObject(Partner object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
    }
}
