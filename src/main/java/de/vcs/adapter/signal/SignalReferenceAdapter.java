package de.vcs.adapter.signal;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.object.Orientation;
import de.vcs.model.odr.signal.SignalReference;
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
        @XMLElement(name = "signalReference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SignalReferenceAdapter implements ObjectBuilder<SignalReference> {

    @Override
    public SignalReference createObject(QName name, Object o) throws ObjectBuildException {
        return new SignalReference();
    }

    @Override
    public void initializeObject(SignalReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("orientation"), Orientation.class, object::setOrientation);
        object.getLinearReference().setS(attributes.getValue("s").getAsDouble());
        object.getLinearReference().setT(attributes.getValue("t").getAsDouble());
    }

    @Override
    public void buildChildObject(SignalReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
        }
    }
}
