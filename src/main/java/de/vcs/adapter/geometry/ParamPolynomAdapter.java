package de.vcs.adapter.geometry;

import de.vcs.model.odr.geometry.ParamPolynom;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class ParamPolynomAdapter implements ObjectBuilder<ParamPolynom> {

    @Override
    public ParamPolynom createObject(QName name) throws ObjectBuildException {
        return new ParamPolynom();
    }

    @Override
    public void initializeObject(ParamPolynom object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("aU").ifDouble(object::setaU);
        attributes.getValue("bU").ifDouble(object::setbU);
        attributes.getValue("cU").ifDouble(object::setcU);
        attributes.getValue("dU").ifDouble(object::setcV);
        attributes.getValue("aV").ifDouble(object::setaV);
        attributes.getValue("bV").ifDouble(object::setbV);
        attributes.getValue("cV").ifDouble(object::setcV);
        attributes.getValue("dV").ifDouble(object::setdV);
    }
}
