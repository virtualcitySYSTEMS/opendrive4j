package de.vcs.adapter.road;

import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.road.RoadType;
import de.vcs.model.odr.road.Speed;
import de.vcs.model.odr.road.Type;
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
        @XMLElement(name = "road/type",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class TypeAdapter implements ObjectBuilder<Type> {

    @Override
    public Type createObject(QName name) throws ObjectBuildException {
        return new Type();
    }

    @Override
    public void initializeObject(Type object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        TextContentChecker.check(attributes.getValue("type"), RoadType.class, object::setType);
        attributes.getValue("country").ifPresent(object::setCountry);
        attributes.getValue("s").ifDouble(object.getLinearReference()::setS);
    }

    @Override
    public void buildChildObject(Type object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "speed":
                    object.setSpeed(reader.getObjectUsingBuilder(SpeedAdapter.class));
                    break;
                case "linearReference":
                    object.setLinearReference(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
            }
        }
    }
}
