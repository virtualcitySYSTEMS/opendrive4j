package de.vcs.test.adapter;

import de.vcs.test.model.Verzeichnis;
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
        @XMLElement(name = "verzeichnis",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class VerzeichnisAdapter implements ObjectBuilder<Verzeichnis> {

    @Override
    public Verzeichnis createObject(QName name) throws ObjectBuildException {
        return new Verzeichnis();
    }

    @Override
    public void buildChildObject(Verzeichnis object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        switch (name.getLocalPart()) {
            case "titel":
                object.setTitel(reader.getObjectUsingBuilder(TitelAdapter.class));
                break;
            case "eintrag":
                object.getEinraege().add(reader.getObjectUsingBuilder(EintragAdapter.class));
                break;
        }
    }
}
