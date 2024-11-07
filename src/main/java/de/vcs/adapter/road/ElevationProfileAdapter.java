package de.vcs.adapter.road;

import de.vcs.adapter.geometry.PolynomAdapter;
import de.vcs.model.odr.road.ElevationProfile;
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
        @XMLElement(name = "elevationProfile",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class ElevationProfileAdapter implements ObjectBuilder<ElevationProfile> {

    @Override
    public ElevationProfile createObject(QName name, Object o) throws ObjectBuildException {
        return new ElevationProfile();
    }

    @Override
    public void buildChildObject(ElevationProfile object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "elevation":
                    object.getElevations().put(attributes.getValue("s").getAsDouble(),
                            reader.getObjectUsingBuilder(PolynomAdapter.class));
                    break;
            }
        }
    }
}
