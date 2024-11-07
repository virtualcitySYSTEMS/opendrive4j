package de.vcs.adapter.junction;

import de.vcs.model.odr.junction.JunctionReference;
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
        @XMLElement(name = "junctionReference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class JunctionReferenceAdapter implements ObjectBuilder<JunctionReference> {

    @Override
    public JunctionReference createObject(QName name, Object o) throws ObjectBuildException {
        return new JunctionReference();
    }

    @Override
    public void initializeObject(JunctionReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("junction").ifPresent(object::setJunction);
    }
}
