package de.vcs.adapter.junction;

import de.vcs.model.odr.junction.Priority;
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
        @XMLElement(name = "priority",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class PriorityAdapter implements ObjectBuilder<Priority> {

    @Override
    public Priority createObject(QName name, Object o) throws ObjectBuildException {
        return new Priority();
    }

    @Override
    public void initializeObject(Priority object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("high").ifPresent(object::setHigh);
        attributes.getValue("low").ifPresent(object::setLow);
    }
}
