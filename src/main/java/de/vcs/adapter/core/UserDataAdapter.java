package de.vcs.adapter.core;

import de.vcs.model.odr.core.UserData;
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
        @XMLElement(name = "userData",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class UserDataAdapter implements ObjectBuilder<UserData> {

    @Override
    public UserData createObject(QName name, Object o) throws ObjectBuildException {
        return new UserData();
    }

    @Override
    public void initializeObject(UserData object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("code").ifPresent(object::setCode);
        attributes.getValue("value").ifPresent(object::setValue);
    }

    @Override
    public void buildChildObject(UserData object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                // TODO no case name???
            }
        }
    }
}
