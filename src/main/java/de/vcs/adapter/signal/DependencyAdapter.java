package de.vcs.adapter.signal;

import de.vcs.model.odr.signal.Dependency;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class DependencyAdapter implements ObjectBuilder<Dependency> {

    @Override
    public Dependency createObject(QName name, Object o) throws ObjectBuildException {
        return new Dependency();
    }

    @Override
    public void initializeObject(Dependency object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        attributes.getValue("type").ifPresent(object::setType);
    }
}
