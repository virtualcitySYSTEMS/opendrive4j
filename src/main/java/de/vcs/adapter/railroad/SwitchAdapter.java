package de.vcs.adapter.railroad;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.railroad.Switch;
import de.vcs.model.odr.railroad.SwitchPosition;
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
        @XMLElement(name = "switch",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SwitchAdapter implements ObjectBuilder<Switch> {

    @Override
    public Switch createObject(QName name, Object o) throws ObjectBuildException {
        return new Switch();
    }

    @Override
    public void initializeObject(Switch object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("position"), SwitchPosition.class, object::setPosition);
    }

    @Override
    public void buildChildObject(Switch object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "mainTrack":
                    object.setMainTrack(reader.getObjectUsingBuilder(MainTrackAdapter.class));
                    break;
                case "sideTrack":
                    object.setSideTrack(reader.getObjectUsingBuilder(SideTrackAdapter.class));
                    break;
                case "partner":
                    object.setPartner(reader.getObjectUsingBuilder(PartnerAdapter.class));
                    break;
            }
        }
    }
}
