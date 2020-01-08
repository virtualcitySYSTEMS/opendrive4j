package de.vcs.adapter.junction;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.junction.Junction;
import de.vcs.model.odr.junction.JunctionType;
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
        @XMLElement(name = "junction",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class JunctionAdapter implements ObjectBuilder<Junction> {

    @Override
    public Junction createObject(QName name) throws ObjectBuildException {
        return new Junction();
    }

    @Override
    public void initializeObject(Junction object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("type"), JunctionType.class, object::setType);
    }

    @Override
    public void buildChildObject(Junction object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "connection":
                    object.getConnections().add(reader.getObjectUsingBuilder(ConnectionAdapter.class));
                    break;
                case "priority":
                    object.getPriorities().add(reader.getObjectUsingBuilder(PriorityAdapter.class));
                    break;
                case "controller":
                    object.getControllers().add(reader.getObjectUsingBuilder(ControllerAdapter.class));
                    break;
                case "surface":
                    object.setSurfaces(reader.getObjectUsingBuilder(SurfaceAdapter.class));
                    break;
            }
        }
    }
}
