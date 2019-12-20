package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.LaneValidity;
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
        @XMLElement(name = "validity",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class LaneValidityAdapter implements ObjectBuilder<LaneValidity> {

    @Override
    public LaneValidity createObject(QName name) throws ObjectBuildException {
        return new LaneValidity();
    }

    @Override
    public void initializeObject(LaneValidity object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("fromLane").ifInteger(object::setFromLane);
        attributes.getValue("toLane").ifInteger(object::setToLane);
    }
}
