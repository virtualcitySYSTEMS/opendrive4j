package de.vcs.adapter.junction;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.junction.ElementDir;
import de.vcs.model.odr.junction.PredecessorSuccessor;
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
        @XMLElement(name = "predecessor",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE),
        @XMLElement(name = "successor",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class PredecessorSuccessorAdapter implements ObjectBuilder<PredecessorSuccessor> {

    @Override
    public PredecessorSuccessor createObject(QName name, Object o) throws ObjectBuildException {
        return new PredecessorSuccessor();
    }

    @Override
    public void initializeObject(PredecessorSuccessor object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("elementType").ifPresent(object::setElementType);
        attributes.getValue("elementId").ifPresent(object::setElementId);
        attributes.getValue("elementS").ifDouble(object::setElementS);
        TextContentChecker.check(attributes.getValue("elementDir"), ElementDir.class, object::setElementDir);
    }
}
