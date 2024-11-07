package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.STTransform;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class STTransformAdapter implements ObjectBuilder<STTransform> {

    @Override
    public STTransform createObject(QName name, Object o) throws ObjectBuildException {
        return new STTransform();
    }

    @Override
    public void initializeObject(STTransform object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractTransformationAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("sOffset").ifDouble(object::setsOffset);
        attributes.getValue("tOffset").ifDouble(object::settOffset);
        attributes.getValue("hOffset").ifDouble(object::sethOffset);
    }
}
