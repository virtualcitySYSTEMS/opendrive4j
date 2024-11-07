package de.vcs.adapter.lane;

import de.vcs.adapter.geometry.PolynomAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.lane.*;
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
        @XMLElement(name = "roadMark",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RoadMarkAdapter implements ObjectBuilder<RoadMark> {

    @Override
    public RoadMark createObject(QName name, Object o) throws ObjectBuildException {
        return new RoadMark();
    }

    @Override
    public void initializeObject(RoadMark object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        TextContentChecker.check(attributes.getValue("type"), RoadMarkType.class, object::setType);
        TextContentChecker.check(attributes.getValue("weight"), RoadMarkWeight.class, object::setWeight);
        TextContentChecker.check(attributes.getValue("color"), RoadMarkColor.class, object::setColor);
        attributes.getValue("material").ifPresent(object::setMaterial);
        attributes.getValue("width").ifDouble(object::setWidth);
        TextContentChecker.check(attributes.getValue("laneChange"), LaneChange.class, object::setLaneChange);
        attributes.getValue("height").ifDouble(object::setHeight);
    }

    @Override
    public void buildChildObject(RoadMark object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "type":
                    object.setDetailedType(reader.getObjectUsingBuilder(TypeAdapter.class));
                    break;
                case "explicit":
                    object.setExplicit(reader.getObjectUsingBuilder(ExplicitRoadMarkAdapter.class));
                    break;
                case "sway":
                    object.getSways().put(attributes.getValue("s").getAsDouble(),
                            reader.getObjectUsingBuilder(PolynomAdapter.class));
            }
        }
    }
}
