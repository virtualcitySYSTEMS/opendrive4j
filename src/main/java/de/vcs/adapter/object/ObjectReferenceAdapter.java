package de.vcs.adapter.object;

import de.vcs.model.odr.object.ObjectReference;
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
        @XMLElement(name = "objectReference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ObjectReferenceAdapter implements ObjectBuilder<ObjectReference> {

    @Override
    public ObjectReference createObject(QName name) throws ObjectBuildException {
        return new ObjectReference();
    }

    @Override
    public void initializeObject(ObjectReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
    }

    @Override
    public void buildChildObject(ObjectReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
