package de.vcs.test.adapter;

import de.vcs.test.model.Beschreibung;
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
        @XMLElement(name = "beschreibung",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class BeschreibungAdapter implements ObjectBuilder<Beschreibung> {

    @Override
    public Beschreibung createObject(QName name) throws ObjectBuildException {
        return new Beschreibung();
    }

    @Override
    public void initializeObject(Beschreibung object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        reader.getTextContent().ifPresent(object::setText);
    }
}
