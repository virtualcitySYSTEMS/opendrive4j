package de.vcs.adapter.road;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.adapter.lane.LanesAdapter;
import de.vcs.adapter.object.BridgeAdapter;
import de.vcs.adapter.object.GenericObjectAdapter;
import de.vcs.adapter.object.ObjectReferenceAdapter;
import de.vcs.adapter.object.TunnelAdapter;
import de.vcs.adapter.railroad.RailroadAdapter;
import de.vcs.adapter.signal.SignalsAdapter;
import de.vcs.model.odr.road.Road;
import de.vcs.model.odr.road.TrafficRule;
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
        @XMLElement(name = "road",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RoadAdapter implements ObjectBuilder<Road> {

    @Override
    public Road createObject(QName name, Object o) throws ObjectBuildException {
        return new Road();
    }

    @Override
    public void initializeObject(Road object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("length").ifDouble(object::setLength);
        attributes.getValue("id").ifPresent(object::setId);
        attributes.getValue("junction").ifPresent(object::setJunction);
        TextContentChecker.check(attributes.getValue("rule"), TrafficRule.class, object::setRule);
    }

    @Override
    public void buildChildObject(Road object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "type":
                    object.getType().add(reader.getObjectUsingBuilder(TypeAdapter.class));
                    break;
                case "link":
                    int xmlDepth = reader.getDepth();
                    while (reader.getDepth() >= xmlDepth) {
                        if (reader.nextTag().equals(START_ELEMENT)) {
                            Attributes childAttributes = reader.getAttributes();
                            switch (reader.getName().getLocalPart()) {
                                case "predecessor":
                                    childAttributes.getValue("elementId").ifPresent(object::setPredecessorId);
                                    reader.nextTag();   // close tag
                                    break;
                                case "successor":
                                    childAttributes.getValue("elementId").ifPresent(object::setSuccessorId);
                                    reader.nextTag();   // close tag
                                    break;
                            }
                        }
                    }
                    break;
                case "lanes":
                    object.setLanes(reader.getObjectUsingBuilder(LanesAdapter.class));
                    break;
                case "objects":
                    int xmlDepth2 = reader.getDepth();
                    while (reader.getDepth() >= xmlDepth2) {
                        if (reader.nextTag().equals(START_ELEMENT)) {
                            attributes = reader.getAttributes();
                            switch (reader.getName().getLocalPart()) {
                                case "object":
                                    object.getObjects().add(reader.getObjectUsingBuilder(GenericObjectAdapter.class));
                                    break;
                                case "tunnel":
                                    object.getObjects().add(reader.getObjectUsingBuilder(TunnelAdapter.class));
                                    break;
                                case "bridge":
                                    object.getObjects().add(reader.getObjectUsingBuilder(BridgeAdapter.class));
                                    break;
                                case "objectReference":
                                    object.getObjects().add(reader.getObjectUsingBuilder(ObjectReferenceAdapter.class));
                                    break;
                            }
                        }
                    }
                    break;
                case "signals":
                    object.setSignals(reader.getObjectUsingBuilder(SignalsAdapter.class));
                    break;
                case "railroad":
                    object.setRailroad(reader.getObjectUsingBuilder(RailroadAdapter.class));
                    break;
                case "surface":
                    object.getCRG().add(reader.getObjectUsingBuilder(SurfaceCRGAdapter.class));
                    break;
                case "lateralProfile":
                    object.setLateralProfile(reader.getObjectUsingBuilder(LateralProfileAdapter.class));
                    break;
                case "elevationProfile":
                    object.setElevationProfile(reader.getObjectUsingBuilder(ElevationProfileAdapter.class));
                    break;
                case "planView":
                    object.setPlanView(reader.getObjectUsingBuilder(PlanViewAdapter.class));
                    break;
                case "geometry":
                    // TODO gml geometry in ODR
                    // object.getGmlGeometries().add(reader.getObjectUsingBuilder(AbstractGeometryAdapter.class));
                    break;
            }
        }
    }
}
