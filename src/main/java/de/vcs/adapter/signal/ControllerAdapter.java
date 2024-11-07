package de.vcs.adapter.signal;

import de.vcs.model.odr.signal.Controller;
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
        @XMLElement(name = "controller",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ControllerAdapter implements ObjectBuilder<Controller> {

    @Override
    public Controller createObject(QName name, Object o) throws ObjectBuildException {
        return new Controller();
    }

    @Override
    public void initializeObject(Controller object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("sequence").ifInteger(object::setSequence);
    }

    @Override
    public void buildChildObject(Controller object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "control":
                    object.getControls().add(reader.getObjectUsingBuilder(ControlAdapter.class));
                    break;
            }
        }
    }
}
