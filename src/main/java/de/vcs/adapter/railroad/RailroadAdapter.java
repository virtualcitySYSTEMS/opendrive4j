package de.vcs.adapter.railroad;

import de.vcs.model.odr.railroad.Railroad;
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
        @XMLElement(name = "railroad",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RailroadAdapter implements ObjectBuilder<Railroad> {

    @Override
    public Railroad createObject(QName name, Object o) throws ObjectBuildException {
        return new Railroad();
    }

    @Override
    public void buildChildObject(Railroad object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "switch":
                    object.getRailSwitches().add(reader.getObjectUsingBuilder(SwitchAdapter.class));
                    break;
            }
        }
    }
}
