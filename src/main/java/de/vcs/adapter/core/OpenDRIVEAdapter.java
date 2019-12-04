package de.vcs.adapter.core;

import de.vcs.model.odr.core.OpenDRIVE;
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
        @XMLElement(name = "OpenDRIVE",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class OpenDRIVEAdapter implements ObjectBuilder<OpenDRIVE> {

    @Override
    public OpenDRIVE createObject(QName name) throws ObjectBuildException {
        return new OpenDRIVE();
    }

    @Override
    public void initializeObject(OpenDRIVE object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
    }

    @Override
    public void buildChildObject(OpenDRIVE object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
    }
}
