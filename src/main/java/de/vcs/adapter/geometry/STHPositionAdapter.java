package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.STHPosition;
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
        @XMLElement(name = "linearReference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class STHPositionAdapter implements ObjectBuilder<STHPosition> {

    @Override
    public STHPosition createObject(QName name) throws ObjectBuildException {
        return new STHPosition();
    }

    @Override
    public void initializeObject(STHPosition object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("s").ifDouble(object::setS);
        attributes.getValue("t").ifDouble(object::setT);
        attributes.getValue("h").ifDouble(object::setH);
    }
}
