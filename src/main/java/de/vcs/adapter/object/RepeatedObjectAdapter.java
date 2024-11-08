package de.vcs.adapter.object;

import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.model.odr.geometry.STHRepeat;
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
        @XMLElement(name = "repeat",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RepeatedObjectAdapter implements ObjectBuilder<STHRepeat> {

    @Override
    public STHRepeat createObject(QName name, Object o) throws ObjectBuildException {
        return new STHRepeat();
    }

    @Override
    public void initializeObject(STHRepeat object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("distance").ifDouble(object::setDistance);
        attributes.getValue("zOffsetStart").ifDouble(object.getStart().getIntertialTransform()::setzOffset);
        attributes.getValue("zOffsetEnd").ifDouble(object.getEnd().getIntertialTransform()::setzOffset);
        attributes.getValue("heightStart").ifDouble(object::setHeightStart);
        attributes.getValue("heightEnd").ifDouble(object::setHeightEnd);
        attributes.getValue("widthStart").ifDouble(object::setWidthStart);
        attributes.getValue("widthEnd").ifDouble(object::setWidthEnd);
        attributes.getValue("lengthStart").ifDouble(object::setLengthStart);
        attributes.getValue("lengthEnd").ifDouble(object::setLengthEnd);
        attributes.getValue("radiusStart").ifDouble(object::setRadiusStart);
        attributes.getValue("radiusEnd").ifDouble(object::setRadiusEnd);
        // odr
        attributes.getValue("s").ifDouble(object.getLinearReference()::setS);   // or sStart ??? check!!!
        attributes.getValue("length").ifDouble(object::setLength);
        attributes.getValue("tStart").ifDouble(object.getStart()::setT);        // or LinearReference ???
        attributes.getValue("tEnd").ifDouble(object.getEnd()::setT);
    }

    @Override
    public void buildChildObject(STHRepeat object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "start":
                    object.setStart(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
                case "end":
                    object.setEnd(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
                case "linearReference":
                    object.setLinearReference(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
            }
        }
    }
}
