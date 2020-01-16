package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.Type;
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
        @XMLElement(name = "lane/type",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class TypeAdapter implements ObjectBuilder<Type> {

    @Override
    public Type createObject(QName name) throws ObjectBuildException {
        return new Type();
    }

    @Override
    public void initializeObject(Type object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("width").ifDouble(object::setWidth);
    }

    @Override
    public void buildChildObject(Type object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "line":
                    object.getLines().add(reader.getObjectUsingBuilder(LineAdapter.class));
            }
        }
    }
}
