package de.vcs.adapter.core;

import de.vcs.adapter.geometry.InertialTransformAdapter;
import de.vcs.model.odr.core.Header;
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
        @XMLElement(name = "header",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class HeaderAdapter implements ObjectBuilder<Header> {

    @Override
    public Header createObject(QName name, Object o) throws ObjectBuildException {
        return new Header();
    }

    @Override
    public void initializeObject(Header object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("revMajor").ifInteger(object::setRevMajor);
        attributes.getValue("revMinor").ifInteger(object::setRevMinor);
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("version").ifPresent(object::setVersion);
        attributes.getValue("date").ifPresent(object::setDate);
        attributes.getValue("north").ifDouble(object::setNorth);
        attributes.getValue("south").ifDouble(object::setSouth);
        attributes.getValue("east").ifDouble(object::setEast);
        attributes.getValue("west").ifDouble(object::setWest);
        attributes.getValue("vendor").ifPresent(object::setVendor);
    }

    @Override
    public void buildChildObject(Header object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "geoReference":
                    object.setGeoReference(reader.getObjectUsingBuilder(GeoReferenceAdapter.class));
                    break;
                case "offset":
                    object.setOffset(reader.getObjectUsingBuilder(InertialTransformAdapter.class));
                    break;
            }
        }
    }
}
