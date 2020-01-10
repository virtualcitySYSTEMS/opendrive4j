package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.object.ParkingSpace;
import de.vcs.model.odr.object.ParkingSpaceAccess;
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
        @XMLElement(name = "parkingSpace",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ParkingSpaceAdapter implements ObjectBuilder<ParkingSpace> {

    @Override
    public ParkingSpace createObject(QName name) throws ObjectBuildException {
        return new ParkingSpace();
    }

    @Override
    public void initializeObject(ParkingSpace object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
        TextContentChecker.check(attributes.getValue("access"), ParkingSpaceAccess.class, object::setAccess);
        attributes.getValue("restrictions").ifPresent(object::setRestrictions);
    }

    @Override
    public void buildChildObject(ParkingSpace object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
