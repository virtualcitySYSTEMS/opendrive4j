package de.vcs.adapter.object;

import de.vcs.model.odr.object.CornerReference;
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
        @XMLElement(name = "cornerReference",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class CornerReferenceAdapter implements ObjectBuilder<CornerReference> {

    @Override
    public CornerReference createObject(QName name) throws ObjectBuildException {
        return new CornerReference();
    }

    @Override
    public void initializeObject(CornerReference object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("outlinePointId").ifPresent(object::setOutlinePointId);
    }
}
