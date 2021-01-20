package de.vcs.adapter.lane;

import de.vcs.adapter.geometry.PolynomAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.adapter.road.SpeedAdapter;
import de.vcs.model.odr.lane.Lane;
import de.vcs.model.odr.lane.LaneType;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

import static org.xmlobjects.stream.EventType.START_ELEMENT;

@XMLElements({
        @XMLElement(name = "lane",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class LaneAdapter implements ObjectBuilder<Lane> {

    @Override
    public Lane createObject(QName name) throws ObjectBuildException {
        return new Lane();
    }

    @Override
    public void initializeObject(Lane object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifInteger(object::setId);
        TextContentChecker.check(attributes.getValue("type"), LaneType.class, object::setType);
        attributes.getValue("level").ifBoolean(object::setLevel);
    }

    @Override
    public void buildChildObject(Lane object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "link":
                    int xmlDepth = reader.getDepth();
                    while (reader.getDepth() >= xmlDepth) {
                        if (reader.nextTag().equals(START_ELEMENT)) {
                            Attributes childAttributes = reader.getAttributes();
                            switch (reader.getName().getLocalPart()) {
                                case "predecessor":
                                    childAttributes.getValue("id").ifInteger(object::setPredecessorId);
                                    reader.nextTag();   // close tag
                                    break;
                                case "successor":
                                    childAttributes.getValue("id").ifInteger(object::setSuccessorId);
                                    reader.nextTag();   // close tag
                                    break;
                            }
                        }
                    }
                    break;
                case "material":
                    object.getMaterials().add(reader.getObjectUsingBuilder(MaterialAdaper.class));
                    break;
                case "speed":
                    object.getSpeeds().add(reader.getObjectUsingBuilder(SpeedAdapter.class));
                    break;
                case "access":
                    object.getAccesses().add(reader.getObjectUsingBuilder(AccessAdapter.class));
                    break;
                case "roadMark":
                    object.getRoadMarks().put(attributes.getValue("sOffset").getAsDouble(),
                            reader.getObjectUsingBuilder(RoadMarkAdapter.class));
                    break;
                case "rule":
                    object.getRules().add(reader.getObjectUsingBuilder(RuleAdapter.class));
                    break;
                case "height":
                    object.getHeights().put(attributes.getValue("sOffset").getAsDouble(),
                            reader.getObjectUsingBuilder(HeightAdapter.class));
                    break;
                case "width":
                    object.getWidths().put(attributes.getValue("sOffset").getAsDouble(),
                            reader.getObjectUsingBuilder(PolynomAdapter.class));
                    break;
                case "border":
                    object.getBorders().put(attributes.getValue("sOffset").getAsDouble(),
                            reader.getObjectUsingBuilder(PolynomAdapter.class));
            }
        }
    }
}
