package de.vcs.adapter.junction;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.junction.Connection;
import de.vcs.model.odr.junction.ContactPoint;
import de.vcs.model.odr.junction.JunctionType;
import de.vcs.model.odr.junction.LaneLink;
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
        @XMLElement(name = "connection",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ConnectionAdapter implements ObjectBuilder<Connection> {

    @Override
    public Connection createObject(QName name) throws ObjectBuildException {
        return new Connection();
    }

    @Override
    public void initializeObject(Connection object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("type"), JunctionType.class, object::setType);
        attributes.getValue("incomingRoad").ifPresent(object::setIncomingRoad);
        attributes.getValue("connectingRoad").ifPresent(object::setConnectingRoad);
        TextContentChecker.check(attributes.getValue("contactPoint"), ContactPoint.class, object::setContactPoint);
    }

    @Override
    public void buildChildObject(Connection object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "predecessor":
                    object.setPredecessor(reader.getObjectUsingBuilder(PredecessorSuccessorAdapter.class));
                    break;
                case "successor":
                    object.setSuccessor(reader.getObjectUsingBuilder(PredecessorSuccessorAdapter.class));
                    break;
                case "laneLink":
                    object.getLaneLinks().add(reader.getObjectUsingBuilder(LaneLinkAdapter.class));
                    break;
            }
        }
    }
}
