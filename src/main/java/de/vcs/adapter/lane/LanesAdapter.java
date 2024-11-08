package de.vcs.adapter.lane;

import de.vcs.adapter.geometry.PolynomAdapter;
import de.vcs.model.odr.lane.Lanes;
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
        @XMLElement(name = "lanes",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class LanesAdapter implements ObjectBuilder<Lanes> {

    @Override
    public Lanes createObject(QName name, Object o) throws ObjectBuildException {
        return new Lanes();
    }

    @Override
    public void buildChildObject(Lanes object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "laneOffset":
                    object.getLaneOffsets().put(attributes.getValue("s").getAsDouble(),
                            reader.getObjectUsingBuilder(PolynomAdapter.class));
                    break;
                case "laneSection":
                    object.getLaneSections().put(attributes.getValue("s").getAsDouble(),
                            reader.getObjectUsingBuilder(LaneSectionAdapter.class));
                    break;
            }
        }
    }
}
