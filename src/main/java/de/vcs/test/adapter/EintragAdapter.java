package de.vcs.test.adapter;

import de.vcs.test.model.Eintrag;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.adapter.geometry.primitives.PointAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

@XMLElements({
        @XMLElement(name = "eintrag",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class EintragAdapter implements ObjectBuilder<Eintrag> {

    @Override
    public Eintrag createObject(QName name) throws ObjectBuildException {
        return new Eintrag();
    }

    @Override
    public void buildChildObject(Eintrag object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        switch (name.getLocalPart()) {
            case "stadt":
                object.setStadt(reader.getObjectUsingBuilder(StadtAdapter.class));
                break;
            case "beschreibung":
                object.setBeschreibung(reader.getObjectUsingBuilder(BeschreibungAdapter.class));
                break;
            case "Point":
                object.setPoint(reader.getObjectUsingBuilder(PointAdapter.class));
        }
    }
}
