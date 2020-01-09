package de.vcs.adapter.core;

import de.vcs.model.odr.core.UserDataContent;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class UserDataContentAdapter implements ObjectBuilder<UserDataContent> {

    @Override
    public UserDataContent createObject(QName name) throws ObjectBuildException {
        return new UserDataContent();
    }

    @Override
    public void initializeObject(UserDataContent object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("content").ifPresent(object::setContent);
    }
}