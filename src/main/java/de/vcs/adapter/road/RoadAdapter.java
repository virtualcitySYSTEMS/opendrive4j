package de.vcs.adapter.road;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.adapter.lane.LanesAdapter;
import de.vcs.adapter.railroad.RailroadAdapter;
import de.vcs.adapter.signal.SignalsAdapter;
import de.vcs.model.odr.road.*;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.adapter.geometry.AbstractGeometryAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.PointAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.PolygonAdapter;
import org.xmlobjects.gml.model.GMLObject;
import org.xmlobjects.gml.model.geometry.AbstractGeometry;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;
import sun.awt.image.ImageWatched;

import javax.xml.namespace.QName;

import static org.xmlobjects.stream.EventType.START_ELEMENT;

@XMLElements({
        @XMLElement(name = "road",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RoadAdapter implements ObjectBuilder<Road> {

    @Override
    public Road createObject(QName name) throws ObjectBuildException {
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
                    boolean isLinkChild = true;
                    while (isLinkChild) {
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
                                default:
                                    isLinkChild = false;
                                    break;
                            }
                        }
                    }
                    break;
                case "lanes":
                    object.setLanes(reader.getObjectUsingBuilder(LanesAdapter.class));
                    break;
                case "objects":
                    // TODO which object child class shall be initialized
                    // object.getObjects().add(reader.getObjectUsingBuilder(ObjectsAdapter.class));
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
