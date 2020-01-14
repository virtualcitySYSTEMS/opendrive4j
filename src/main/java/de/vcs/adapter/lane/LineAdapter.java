package de.vcs.adapter.lane;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.lane.Line;
import de.vcs.model.odr.lane.RoadMarkColor;
import de.vcs.model.odr.lane.RoadMarkRule;
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
        @XMLElement(name = "line",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class LineAdapter implements ObjectBuilder<Line> {

    @Override
    public Line createObject(QName name) throws ObjectBuildException {
        return new Line();
    }

    @Override
    public void initializeObject(Line object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("length").ifDouble(object::setLength);
        attributes.getValue("space").ifDouble(object::setSpace);
        TextContentChecker.check(attributes.getValue("rule"), RoadMarkRule.class, object::setRule);
        attributes.getValue("width").ifDouble(object::setWidth);
        TextContentChecker.check(attributes.getValue("color"), RoadMarkColor.class, object::setColor);
        attributes.getValue("tOffset").ifDouble(object.getStTransform()::settOffset);
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
    }
}
