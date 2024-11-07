package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.Rule;
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
        @XMLElement(name = "rule",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RuleAdapter implements ObjectBuilder<Rule> {

    @Override
    public Rule createObject(QName name, Object o) throws ObjectBuildException {
        return new Rule();
    }

    @Override
    public void initializeObject(Rule object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        attributes.getValue("value").ifPresent(object::setValue);
    }
}
