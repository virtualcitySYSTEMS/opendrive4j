package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.AbstractSTGeometry;
import de.vcs.util.ODRConstants;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.geometry.primitives.PointAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public abstract class AbstractSTGeometryAdapter {

    public static void setSuperAttributes(AbstractSTGeometry object, QName name, Attributes attributes,
            XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("length").ifDouble(object::setLength);
    }

    public static void buildSuperChildObject(AbstractSTGeometry object, QName name, Attributes attributes,
            XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "linearReference":
                    object.setLinearReference(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
                case "inertialReference":
                    object.setInertialReference(reader.getObjectUsingBuilder(PointAdapter.class));
                    break;
            }
        }
    }
}
