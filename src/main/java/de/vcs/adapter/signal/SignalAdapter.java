package de.vcs.adapter.signal;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.core.UnitEnumCollection;
import de.vcs.model.odr.object.BorderType;
import de.vcs.model.odr.signal.Signal;
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
        @XMLElement(name = "signal",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SignalAdapter implements ObjectBuilder<Signal> {

    @Override
    public Signal createObject(QName name) throws ObjectBuildException {
        return new Signal();
    }

    @Override
    public void initializeObject(Signal object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("dynamic").ifBoolean(object::setDynamic);
        TextContentChecker.check(attributes.getValue("orientation"), BorderType.class, object::setOrientation);
        attributes.getValue("country").ifPresent(object::setCountry);
        attributes.getValue("countryRevision").ifPresent(object::setCountryRevision);
        attributes.getValue("type").ifPresent(object::setType);
        attributes.getValue("subtype").ifPresent(object::setSubtype);
        attributes.getValue("value").ifDouble(object::setValue);
        TextContentChecker.check(attributes.getValue("unit"), UnitEnumCollection.getUnitEnums(), object::setUnit);
        attributes.getValue("height").ifDouble(object::setHeight);
        attributes.getValue("width").ifDouble(object::setWidth);
        attributes.getValue("text").ifPresent(object::setText);
    }

    @Override
    public void buildChildObject(Signal object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "dependency":
                    object.getDependencies().add(reader.getObjectUsingBuilder(DependencyAdapter.class));
                    break;
            }
        }
    }
}
