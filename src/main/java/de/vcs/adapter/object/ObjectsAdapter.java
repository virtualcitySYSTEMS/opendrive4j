package de.vcs.adapter.object;

import de.vcs.model.odr.object.Objects;
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
        @XMLElement(name = "objects",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public abstract class ObjectsAdapter implements ObjectBuilder<Objects> {

    @Override
    public Objects createObject(QName qName, Object o) throws ObjectBuildException {
        return new Objects();
    }

    @Override
    public void buildChildObject(Objects object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "object":
                    object.getObjects().add(reader.getObjectUsingBuilder(GenericObjectAdapter.class));
                    break;
                case "tunnel":
                    object.getObjects().add(reader.getObjectUsingBuilder(TunnelAdapter.class));
                    break;
                case "bridge":
                    object.getObjects().add(reader.getObjectUsingBuilder(BridgeAdapter.class));
                    break;
                case "objectReference":
                    object.getObjects().add(reader.getObjectUsingBuilder(ObjectReferenceAdapter.class));
                    break;
            }
        }
    }
}
