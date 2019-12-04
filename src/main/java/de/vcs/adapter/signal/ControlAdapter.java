package de.vcs.adapter.signal;

import de.vcs.model.odr.signal.Control;
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
        @XMLElement(name = "control",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ControlAdapter implements ObjectBuilder<Control> {

    @Override
    public Control createObject(QName name) throws ObjectBuildException {
        return new Control();
    }

    @Override
    public void initializeObject(Control object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("signalId").ifPresent(object::setSignalId);
        attributes.getValue("type").ifPresent(object::setType);
    }
}
