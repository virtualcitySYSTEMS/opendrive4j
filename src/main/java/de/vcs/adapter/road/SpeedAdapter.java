package de.vcs.adapter.road;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.core.UnitSpeed;
import de.vcs.model.odr.road.MaxSpeed;
import de.vcs.model.odr.road.Speed;
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
    public Speed createObject(QName name, Object o) throws ObjectBuildException {
        return new Speed();
    }

    @Override
    public void initializeObject(Speed object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        TextContentChecker.check(attributes.getValue("max"), MaxSpeed.class, object::setMax);
        attributes.getValue("max").ifDouble(object::setMaxValue);
        TextContentChecker.check(attributes.getValue("unit"), UnitSpeed.class, object::setMax);
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
    }
}
