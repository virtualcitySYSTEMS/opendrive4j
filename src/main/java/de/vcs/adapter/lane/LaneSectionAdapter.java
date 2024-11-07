package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.LaneSection;
import de.vcs.util.ODRConstants;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.EventType;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class LaneSectionAdapter implements ObjectBuilder<LaneSection> {

    @Override
    public LaneSection createObject(QName name, Object o) throws ObjectBuildException {
        return new LaneSection();
    }

    @Override
    public void initializeObject(LaneSection object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("singleSide").ifBoolean(object::setSingleSide);
        attributes.getValue("s").ifDouble(object.getLinearReference()::setS);
    }

    @Override
    public void buildChildObject(LaneSection object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            int xmlDepth = reader.getDepth();
            switch (name.getLocalPart()) {
                case "center":
                    do {
                        if (reader.nextTag().equals(EventType.START_ELEMENT)) {
                            if (reader.getName().getLocalPart().equalsIgnoreCase("lane")) {
                                object.setCenterLane(reader.getObjectUsingBuilder(LaneAdapter.class));
                            }
                        }
                    } while (reader.getDepth() >= xmlDepth);
                    break;
                case "right":
                    do {
                        if (reader.nextTag().equals(EventType.START_ELEMENT)) {
                            Attributes childAttributes = reader.getAttributes();
                            if (reader.getName().getLocalPart().equalsIgnoreCase("lane")) {
                                object.getRightLanes().put(childAttributes.getValue("id").getAsInteger(),
                                        reader.getObjectUsingBuilder(LaneAdapter.class));
                            }
                        }
                    } while (reader.getDepth() >= xmlDepth);
                    break;
                case "left":
                    do {
                        if (reader.nextTag().equals(EventType.START_ELEMENT)) {
                            Attributes childAttributes = reader.getAttributes();
                            if (reader.getName().getLocalPart().equalsIgnoreCase("lane")) {
                                object.getLeftLanes().put(childAttributes.getValue("id").getAsInteger(),
                                        reader.getObjectUsingBuilder(LaneAdapter.class));
                            }
                        }
                    } while (reader.getDepth() >= xmlDepth);
                    break;
            }
        }
    }
}
