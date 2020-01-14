package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.Material;
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
        @XMLElement(name = "material",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class MaterialAdaper implements ObjectBuilder<Material> {

    @Override
    public Material createObject(QName name) throws ObjectBuildException {
        return new Material();
    }

    @Override
    public void initializeObject(Material object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        attributes.getValue("surface").ifPresent(object::setSurface);
        attributes.getValue("friction").ifDouble(object::setFriction);
        attributes.getValue("roughness").ifDouble(object::setRoughness);
    }
}
