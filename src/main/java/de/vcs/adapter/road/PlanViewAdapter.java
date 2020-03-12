package de.vcs.adapter.road;

import de.vcs.adapter.geometry.*;
import de.vcs.model.odr.geometry.*;
import de.vcs.model.odr.road.PlanView;
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
        @XMLElement(name = "planView",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class PlanViewAdapter implements ObjectBuilder<PlanView> {

    @Override
    public PlanView createObject(QName name) throws ObjectBuildException {
        return new PlanView();
    }

    @Override
    public void buildChildObject(PlanView object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            if (name.getLocalPart().equalsIgnoreCase("geometry")) {
                reader.nextTag();
                switch (reader.getName().getLocalPart()) {
                    case "line":
                        Line line = reader.getObjectUsingBuilder(LineAdapter.class);
                        AbstractSTGeometryAdapter.setSuperAttributes(line, name, attributes, reader);
                        AbstractSTGeometryAdapter.buildSuperChildObject(line, name, attributes, reader);
                        object.getOdrGeometries().put(attributes.getValue("s").getAsDouble(), line);
                        break;
                    case "arc":
                        Arc arc = reader.getObjectUsingBuilder(ArcAdapter.class);
                        AbstractSTGeometryAdapter.setSuperAttributes(arc, name, attributes, reader);
                        AbstractSTGeometryAdapter.buildSuperChildObject(arc, name, attributes, reader);
                        object.getOdrGeometries().put(attributes.getValue("s").getAsDouble(), arc);
                        break;
                    case "spiral":
                        Spiral spiral = reader.getObjectUsingBuilder(SpiralAdapter.class);
                        AbstractSTGeometryAdapter.setSuperAttributes(spiral, name, attributes, reader);
                        AbstractSTGeometryAdapter.buildSuperChildObject(spiral, name, attributes, reader);
                        object.getOdrGeometries().put(attributes.getValue("s").getAsDouble(), spiral);
                        break;
                    case "poly3":
                        Polynom poly = reader.getObjectUsingBuilder(PolynomAdapter.class);
                        AbstractSTGeometryAdapter.setSuperAttributes(poly, name, attributes, reader);
                        AbstractSTGeometryAdapter.buildSuperChildObject(poly, name, attributes, reader);
                        object.getOdrGeometries().put(attributes.getValue("s").getAsDouble(), poly);
                        break;
                    case "paramPoly3":
                        ParamPolynom paramPoly = reader.getObjectUsingBuilder(ParamPolynomAdapter.class);
                        AbstractSTGeometryAdapter.setSuperAttributes(paramPoly, name, attributes, reader);
                        AbstractSTGeometryAdapter.buildSuperChildObject(paramPoly, name, attributes, reader);
                        object.getOdrGeometries().put(attributes.getValue("s").getAsDouble(), paramPoly);
                        break;
                }
            }
        }
    }
}
