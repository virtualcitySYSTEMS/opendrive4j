package de.vcs.adapter.lane;

import de.vcs.model.odr.lane.Height;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class HeightAdapter implements ObjectBuilder<Height> {

    @Override
    public Height createObject(QName name) throws ObjectBuildException {
        return new Height();
    }

    @Override
    public void initializeObject(Height object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        attributes.getValue("inner").ifDouble(object::setInner);
        attributes.getValue("outer").ifDouble(object::setOuter);
    }
}
