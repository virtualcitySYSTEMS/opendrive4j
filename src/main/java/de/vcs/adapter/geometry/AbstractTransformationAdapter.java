package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.AbstractTransformation;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public abstract class AbstractTransformationAdapter {

    public static void setSuperAttributes(AbstractTransformation object, QName name, Attributes attributes,
            XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("hdg").ifDouble(object::setHdg);
        attributes.getValue("pitch").ifDouble(object::setPitch);
        attributes.getValue("roll").ifDouble(object::setRoll);
    }
}
