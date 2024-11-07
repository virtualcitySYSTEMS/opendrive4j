package de.vcs.adapter.core;

import de.vcs.adapter.junction.JunctionAdapter;
import de.vcs.adapter.junction.JunctionGroupAdapter;
import de.vcs.adapter.railroad.StationAdapter;
import de.vcs.adapter.road.RoadAdapter;
import de.vcs.adapter.signal.ControllerAdapter;
import de.vcs.model.odr.core.OpenDRIVE;
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
        @XMLElement(name = "OpenDRIVE",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class OpenDRIVEAdapter implements ObjectBuilder<OpenDRIVE> {

    @Override
    public OpenDRIVE createObject(QName name, Object o) throws ObjectBuildException {
        return new OpenDRIVE();
    }

    @Override
    public void buildChildObject(OpenDRIVE object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "header":
                    object.setHeader(reader.getObjectUsingBuilder(HeaderAdapter.class));
                    break;
                case "road":
                    object.getRoads().add(reader.getObjectUsingBuilder(RoadAdapter.class));
                    break;
                case "controller":
                    object.getController().add(reader.getObjectUsingBuilder(ControllerAdapter.class));
                    break;
                case "junction":
                    object.getJunctions().add(reader.getObjectUsingBuilder(JunctionAdapter.class));
                    break;
                case "junctionGroup":
                    object.getJunctionGroups().add(reader.getObjectUsingBuilder(JunctionGroupAdapter.class));
                    break;
                case "station":
                    object.getStations().add(reader.getObjectUsingBuilder(StationAdapter.class));
                    break;
            }
        }
    }
}
