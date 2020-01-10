package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.lane.RoadMarkColor;
import de.vcs.model.odr.lane.RoadMarkWeight;
import de.vcs.model.odr.object.CornerReference;
import de.vcs.model.odr.object.Marking;
import de.vcs.model.odr.object.SideType;
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
        @XMLElement(name = "marking",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE),
        @XMLElement(name = "markings",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class MarkingAdapter implements ObjectBuilder<Marking> {

    @Override
    public Marking createObject(QName name) throws ObjectBuildException {
        return new Marking();
    }

    @Override
    public void initializeObject(Marking object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
        TextContentChecker.check(attributes.getValue("side"), SideType.class, object::setSide);
        TextContentChecker.check(attributes.getValue("weight"), RoadMarkWeight.class, object::setWeight);
        attributes.getValue("width").ifDouble(object::setWidth);
        TextContentChecker.check(attributes.getValue("color"), RoadMarkColor.class, object::setColor);
        attributes.getValue("spaceLength").ifDouble(object::setSpaceLength);
        attributes.getValue("lineLength").ifDouble(object::setLineLength);
        attributes.getValue("startOffset").ifDouble(object::setStartOffset);
        attributes.getValue("endOffset").ifDouble(object::setStopOffset);
    }

    @Override
    public void buildChildObject(Marking object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.buildSuperChildObject(object, name, attributes, reader);
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "cornerReference":
                    object.getCornerReferences().add(reader.getObjectUsingBuilder(CornerReferenceAdapter.class));
                    break;
            }
        }
    }
}
