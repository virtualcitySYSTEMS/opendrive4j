package de.vcs.adapter.object;

import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.adapter.lane.LaneValidityAdapter;
import de.vcs.model.odr.lane.LaneValidity;
import de.vcs.model.odr.object.AbstractObject;
import de.vcs.model.odr.object.Orientation;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.model.GMLObject;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

// is this neccessary here? do we have to implement ObjectBuilder in an AbstractClass
@XMLElements({
        @XMLElement(name = "object",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE),
        @XMLElement(name = "objects",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public abstract class AbstractObjectAdapter implements ObjectBuilder<AbstractObject> {

    public static void setSuperAttributes(AbstractObject object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("name").ifPresent(object::setName);
        attributes.getValue("id").ifPresent(object::setId);
        attributes.getValue("validLength").ifDouble(object::setValidLength);
        TextContentChecker.check(attributes.getValue("orientation"), Orientation.class, object::setOrientation);
        attributes.getValue("length").ifDouble(object::setLength);
        attributes.getValue("height").ifDouble(object::setHeight);
        attributes.getValue("width").ifDouble(object::setWidth);
        attributes.getValue("radius").ifDouble(object::setRadius);
    }

    public static void buildSuperChildObject(AbstractObject object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "outlines":
                    object.getOutlines().add(reader.getObjectUsingBuilder(OutlineAdapter.class));
                    break;
                case "validities":
                    object.getValidities().add(reader.getObjectUsingBuilder(LaneValidityAdapter.class));
                    break;
                case "materials":
                    object.getMaterials().add(reader.getObjectUsingBuilder(MaterialAdapter.class));
                    break;
                case "gmlGeometries":
                    // object.getGmlGeometries().add(reader.getObjectUsingBuilder(GMLObjectAdapater.class));
                    break;
                case "linearReference":
                    object.setLinearReference(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
            }
        }
    }
}
