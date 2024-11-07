package de.vcs.adapter.lane;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.lane.Access;
import de.vcs.model.odr.lane.AccessRestriction;
import de.vcs.model.odr.lane.AccessRule;
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
        @XMLElement(name = "access",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class AccessAdapter implements ObjectBuilder<Access> {

    @Override
    public Access createObject(QName name, Object o) throws ObjectBuildException {
        return new Access();
    }

    @Override
    public void initializeObject(Access object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        TextContentChecker.check(attributes.getValue("rule"), AccessRule.class, object::setRule);
        TextContentChecker.check(attributes.getValue("restriction"), AccessRestriction.class, object::setRestriction);
    }
}
