package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.object.Tunnel;
import de.vcs.model.odr.object.TunnelType;
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
        @XMLElement(name = "tunnel",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class TunnelAdapter implements ObjectBuilder<Tunnel> {

    @Override
    public Tunnel createObject(QName name) throws ObjectBuildException {
        return new Tunnel();
    }

    @Override
    public void initializeObject(Tunnel object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.setSuperAttributes(object, name, attributes, reader);
        TextContentChecker.check(attributes.getValue("type"), TunnelType.class, object::setType);
        attributes.getValue("lighting").ifBoolean(object::setLighting);
        attributes.getValue("daylight").ifBoolean(object::setDaylight);
    }

    @Override
    public void buildChildObject(Tunnel object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractObjectAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
