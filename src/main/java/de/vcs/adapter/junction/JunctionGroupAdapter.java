package de.vcs.adapter.junction;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.junction.JunctionGroup;
import de.vcs.model.odr.junction.JunctionGroupType;
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
        @XMLElement(name = "junctionGroup",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class JunctionGroupAdapter implements ObjectBuilder<JunctionGroup> {

    @Override
    public JunctionGroup createObject(QName name, Object o) throws ObjectBuildException {
        return new JunctionGroup();
    }

    @Override
    public void initializeObject(JunctionGroup object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
        TextContentChecker.check(attributes.getValue("type"), JunctionGroupType.class, object::setType);
    }

    @Override
    public void buildChildObject(JunctionGroup object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "junctionReference":
                    object.getJunctionReference().add(reader.getObjectUsingBuilder(JunctionReferenceAdapter.class));
                    break;
            }
        }
    }
}
