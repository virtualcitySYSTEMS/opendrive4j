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
    public LaneSection createObject(QName name) throws ObjectBuildException {
        return new LaneSection();
    }

    @Override
    public void initializeObject(LaneSection object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("singleSide").ifBoolean(object::setSingleSide);
    }

    @Override
    public void buildChildObject(LaneSection object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "center":
                    if (reader.nextTag().equals(EventType.START_ELEMENT)) {
                        object.getCenterLanes().add(reader.getObjectUsingBuilder(LaneAdapter.class));
                    }
                    break;
                case "right":
                    if (reader.nextTag().equals(EventType.START_ELEMENT)) {
                        object.getRightLanes().add(reader.getObjectUsingBuilder(LaneAdapter.class));
                    }
                    break;
                case "left":
                    if (reader.nextTag().equals(EventType.START_ELEMENT)) {
                        object.getLeftLanes().add(reader.getObjectUsingBuilder(LaneAdapter.class));
                    }
                    break;
            }
        }
    }
}
