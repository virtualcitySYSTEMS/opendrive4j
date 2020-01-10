package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.AbstractODRGeometry;
import de.vcs.util.ODRConstants;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public abstract class AbstractODRGeometryAdapter {

    public static void setSuperAttributes(AbstractODRGeometry object, QName name, Attributes attributes,
            XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifPresent(object::setId);
    }

    public static void buildSuperChildObject(AbstractODRGeometry object, QName name, Attributes attributes,
            XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "stTransform":
                    object.setStTransform(reader.getObjectUsingBuilder(STTransformAdapter.class));
                    break;
                case "inertialTransform":
                    object.setIntertialTransform(reader.getObjectUsingBuilder(InertialTransformAdapter.class));
                    break;
            }
        }
    }
}
