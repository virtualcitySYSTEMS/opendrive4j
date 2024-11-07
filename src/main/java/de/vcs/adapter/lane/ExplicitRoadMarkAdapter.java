package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.ExplicitRoadMark;
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
        @XMLElement(name = "explicit",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ExplicitRoadMarkAdapter implements ObjectBuilder<ExplicitRoadMark> {

    @Override
    public ExplicitRoadMark createObject(QName name, Object o) throws ObjectBuildException {
        return new ExplicitRoadMark();
    }

    @Override
    public void buildChildObject(ExplicitRoadMark object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "line":
                    object.getLines().add(reader.getObjectUsingBuilder(LineAdapter.class));
            }
        }
    }
}
