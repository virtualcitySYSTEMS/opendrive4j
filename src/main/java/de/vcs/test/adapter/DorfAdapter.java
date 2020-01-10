package de.vcs.test.adapter;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.test.enums.Enum1;
import de.vcs.test.enums.Enum2;
import de.vcs.test.model.Dorf;
import de.vcs.test.model.Stadt;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;
import java.util.ArrayList;

@XMLElements({
        @XMLElement(name = "dorf",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class DorfAdapter implements ObjectBuilder<Dorf> {

    @Override
    public Dorf createObject(QName name) throws ObjectBuildException {
        return new Dorf();
    }

    public void initializeObject(Dorf object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        StadtAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("boazn").ifPresent(object::setBoazn);
    }
}
