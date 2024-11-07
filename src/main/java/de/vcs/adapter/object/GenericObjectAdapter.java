package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.object.GenericObject;
import de.vcs.model.odr.object.ObjectType;
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
        @XMLElement(name = "genericObject",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class GenericObjectAdapter implements ObjectBuilder<GenericObject> {

    @Override
    public GenericObject createObject(QName name, Object o) throws ObjectBuildException {
        return new GenericObject();
    }

    @Override
    public void initializeObject(GenericObject object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
        TextContentChecker.check(attributes.getValue("type"), ObjectType.class, object::setType);
        attributes.getValue("subtype").ifPresent(object::setSubtype);
        attributes.getValue("dynamic").ifBoolean(object::setDynamic);
    }

    @Override
    public void buildChildObject(GenericObject object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.buildSuperChildObject(object, name, attributes, reader);
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "repeat":
                    object.getRepeat().put(attributes.getValue("s").getAsDouble(),
                            reader.getObjectUsingBuilder(RepeatedObjectAdapter.class));
                    break;
            }
        }
    }
}
