package de.vcs.adapter.junction;

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
        @XMLElement(name = "laneLink",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class LaneLinkAdapter implements ObjectBuilder<LaneLink> {

    @Override
    public LaneLink createObject(QName name) throws ObjectBuildException {
        return new LaneLink();
    }

    @Override
    public void initializeObject(LaneLink object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("from").ifInteger(object::setFrom);
        attributes.getValue("to").ifInteger(object::setTo);
    }
}
