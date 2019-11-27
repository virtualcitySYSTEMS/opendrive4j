package de.vcs.test.adapter;

import de.vcs.test.model.Stadt;
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
        @XMLElement(name = "stadt",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class StadtAdapter implements ObjectBuilder<Stadt> {

    @Override
    public Stadt createObject(QName name) throws ObjectBuildException {
        return new Stadt();
    }

    @Override
    public void initializeObject(Stadt object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
    }
}
