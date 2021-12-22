package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.AbstractSTGeometry;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.util.ODRConstants;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.geometry.primitives.PointAdapter;
import org.xmlobjects.gml.model.geometry.DirectPosition;
import org.xmlobjects.gml.model.geometry.primitives.Point;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public abstract class AbstractSTGeometryAdapter {

    public static void setSuperAttributes(AbstractSTGeometry object, QName name, Attributes attributes,
            XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("length").ifDouble(object::setLength);
        // odr
        attributes.getValue("s").ifDouble(object.getLinearReference()::setS);
        attributes.getValue("t").ifDouble(object.getLinearReference()::setT);
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        attributes.getValue("tOffset").ifDouble(object.getStTransform()::settOffset);
        ArrayList<Double> xyList = new ArrayList<>();
        attributes.getValue("x").ifDouble(xyList::add);
        attributes.getValue("y").ifDouble(xyList::add);
        object.setInertialReference(new Point(new DirectPosition(xyList)));
        attributes.getValue("hdg").ifDouble(object.getIntertialTransform()::setHdg);
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
                case "stTransform":
                    object.setStTransform(reader.getObjectUsingBuilder(STTransformAdapter.class));
                    break;
            }
        }
    }
}
