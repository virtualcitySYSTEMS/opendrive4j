package de.vcs.adapter.junction;

import de.vcs.model.odr.junction.Controller;
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
    public Controller createObject(QName name) throws ObjectBuildException {
        return new Controller();
    }

    @Override
    public void initializeObject(Controller object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        attributes.getValue("type").ifPresent(object::setType);
        attributes.getValue("sequence").ifInteger(object::setSequence);
    }
}
