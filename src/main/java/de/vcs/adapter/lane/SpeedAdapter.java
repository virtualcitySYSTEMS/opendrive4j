package de.vcs.adapter.lane;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.core.UnitSpeed;
import de.vcs.model.odr.lane.Speed;
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
        @XMLElement(name = "speed",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SpeedAdapter implements ObjectBuilder<Speed> {

    @Override
    public Speed createObject(QName name) throws ObjectBuildException {
        return new Speed();
    }

    @Override
    public void initializeObject(Speed object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        attributes.getValue("max").ifDouble(object::setMax);
        TextContentChecker.check(attributes.getValue("unit"), UnitSpeed.class, object::setUnit);
    }
}
