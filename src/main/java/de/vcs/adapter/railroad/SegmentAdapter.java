package de.vcs.adapter.railroad;

import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.geometry.STHPosition;
import de.vcs.model.odr.railroad.PlatformSide;
import de.vcs.model.odr.railroad.Segment;
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
        @XMLElement(name = "segment",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SegmentAdapter implements ObjectBuilder<Segment> {

    @Override
    public Segment createObject(QName name) throws ObjectBuildException {
        return new Segment();
    }

    @Override
    public void initializeObject(Segment object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("roadId").ifPresent(object::setRoadId);
        TextContentChecker.check(attributes.getValue("side"), PlatformSide.class, object::setSide);
        attributes.getValue("sStart").ifDouble(object.getsStart()::setS);
        attributes.getValue("sEnd").ifDouble(object.getsEnd()::setS);
    }

    @Override
    public void buildChildObject(Segment object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "sStart":
                    object.setsStart(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
                case "sEnd":
                    object.setsEnd(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
            }
        }
    }
}
