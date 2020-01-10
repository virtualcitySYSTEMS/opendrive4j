package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.object.Bridge;
import de.vcs.model.odr.object.BridgeType;
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
        @XMLElement(name = "bridge",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class BridgeAdapter implements ObjectBuilder<Bridge> {

    @Override
    public Bridge createObject(QName name) throws ObjectBuildException {
        return new Bridge();
    }

    public void initializeObject(Bridge object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
        TextContentChecker.check(attributes.getValue("type"), BridgeType.class, object::setType);
    }

    @Override
    public void buildChildObject(Bridge object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
