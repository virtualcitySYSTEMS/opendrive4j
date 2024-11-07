package de.vcs.adapter.railroad;

import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.junction.ElementDir;
import de.vcs.model.odr.railroad.SideTrack;
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
        @XMLElement(name = "sideTrack",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SideTrackAdapter implements ObjectBuilder<SideTrack> {

    @Override
    public SideTrack createObject(QName name, Object o) throws ObjectBuildException {
        return new SideTrack();
    }

    @Override
    public void initializeObject(SideTrack object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("dir"), ElementDir.class, object::setDir);
        attributes.getValue("s").ifDouble(object.getLinearReference()::setS);
    }

    @Override
    public void buildChildObject(SideTrack object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "linearReference":
                    object.setLinearReference(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
            }
        }
    }
}
