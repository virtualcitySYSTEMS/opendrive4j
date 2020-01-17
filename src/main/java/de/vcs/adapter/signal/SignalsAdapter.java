package de.vcs.adapter.signal;

import de.vcs.model.odr.signal.SignalReference;
import de.vcs.model.odr.signal.Signals;
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
        @XMLElement(name = "signals",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SignalsAdapter implements ObjectBuilder<Signals> {

    @Override
    public Signals createObject(QName name) throws ObjectBuildException {
        return new Signals();
    }

    @Override
    public void buildChildObject(Signals object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "signal":
                    object.getSignals().add(reader.getObjectUsingBuilder(SignalAdapter.class));
                    break;
                case "signalReference":
                    object.getSignalReferences().add(reader.getObjectUsingBuilder(SignalReferenceAdapter.class));
                    break;
            }
        }
    }
}
