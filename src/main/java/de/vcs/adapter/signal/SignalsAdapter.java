package de.vcs.adapter.signal;

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
    public void initializeObject(Signals object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
    }

    @Override
    public void buildChildObject(Signals object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
    }
}
