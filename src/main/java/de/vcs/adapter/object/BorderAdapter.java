package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.object.Border;
import de.vcs.model.odr.object.BorderType;
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
        @XMLElement(name = "border",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class BorderAdapter implements ObjectBuilder<Border> {

    @Override
    public Border createObject(QName name, Object o) throws ObjectBuildException {
        return new Border();
    }

    @Override
    public void initializeObject(Border object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
        TextContentChecker.check(attributes.getValue("type"), BorderType.class, object::setType);
        attributes.getValue("outlineId").ifInteger(object::setOutlineId);
        attributes.getValue("useCompleteOutline").ifBoolean(object::setUseCompleteOutline);
    }

    @Override
    public void buildChildObject(Border object, QName name, Attributes attributes, XMLReader reader)
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
