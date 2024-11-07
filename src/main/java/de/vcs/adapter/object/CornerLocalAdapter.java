package de.vcs.adapter.object;

import de.vcs.model.odr.object.CornerLocal;
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
        @XMLElement(name = "cornerLocal",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class CornerLocalAdapter implements ObjectBuilder<CornerLocal> {

    @Override
    public CornerLocal createObject(QName name, Object o) throws ObjectBuildException {
        return new CornerLocal();
    }

    @Override
    public void initializeObject(CornerLocal object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("u").ifDouble(object.getUvzPosition()::setU);
        attributes.getValue("v").ifDouble(object.getUvzPosition()::setV);
        attributes.getValue("z").ifDouble(object.getUvzPosition()::setZ);
        attributes.getValue("height").ifDouble(object::setHeight);
    }
}
