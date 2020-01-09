package de.vcs.adapter.railroad;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.railroad.Platform;
import de.vcs.model.odr.railroad.Station;
import de.vcs.model.odr.railroad.StationType;
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
        @XMLElement(name = "station",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class StationAdapter implements ObjectBuilder<Station> {

    @Override
    public Station createObject(QName name) throws ObjectBuildException {
        return new Station();
    }

    @Override
    public void initializeObject(Station object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("type"), StationType.class, object::setType);
    }

    @Override
    public void buildChildObject(Station object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "platform":
                    object.getPlatforms().add(reader.getObjectUsingBuilder(PlatformAdapter.class));
                    break;
            }
        }
    }
}