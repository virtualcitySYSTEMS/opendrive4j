package de.vcs.adapter.object;

import de.vcs.model.odr.object.CornerRoad;
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
        @XMLElement(name = "cornerRoad",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class CornerRoadAdapter implements ObjectBuilder<CornerRoad> {

    @Override
    public CornerRoad createObject(QName name) throws ObjectBuildException {
        return new CornerRoad();
    }

    @Override
    public void initializeObject(CornerRoad object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("s").ifDouble(object.getSthPosition()::setS);
        attributes.getValue("t").ifDouble(object.getSthPosition()::setT);
        attributes.getValue("dz").ifDouble(object.getSthPosition()::setH);
        attributes.getValue("height").ifDouble(object::setHeight);
    }
}
