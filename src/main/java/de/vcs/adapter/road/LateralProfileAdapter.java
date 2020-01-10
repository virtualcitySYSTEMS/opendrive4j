package de.vcs.adapter.road;

import de.vcs.adapter.geometry.PolynomAdapter;
import de.vcs.model.odr.road.ElevationProfile;
import de.vcs.model.odr.road.LateralProfile;
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
        @XMLElement(name = "lateralProfile",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class LateralProfileAdapter implements ObjectBuilder<LateralProfile> {

    @Override
    public LateralProfile createObject(QName name) throws ObjectBuildException {
        return new LateralProfile();
    }

    @Override
    public void buildChildObject(LateralProfile object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "superElevation":
                    object.getSuperElevations().add(reader.getObjectUsingBuilder(PolynomAdapter.class));
                    break;
                case "shape":
                    object.getShapes().add(reader.getObjectUsingBuilder(PolynomAdapter.class));
                    break;
            }
        }
    }
}
