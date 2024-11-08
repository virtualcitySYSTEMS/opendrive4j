package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.Polynom;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class PolynomAdapter implements ObjectBuilder<Polynom> {

    @Override
    public Polynom createObject(QName name, Object o) throws ObjectBuildException {
        return new Polynom();
    }

    @Override
    public void initializeObject(Polynom object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.setSuperAttributes(object, name, attributes, reader);
        attributes.getValue("a").ifDouble(object::setA);
        attributes.getValue("b").ifDouble(object::setB);
        attributes.getValue("c").ifDouble(object::setC);
        attributes.getValue("d").ifDouble(object::setD);
    }

    @Override
    public void buildChildObject(Polynom object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        AbstractSTGeometryAdapter.buildSuperChildObject(object, name, attributes, reader);
    }
}
