package de.vcs.adapter.road;

import de.vcs.adapter.geometry.AbstractODRGeometryAdapter;
import de.vcs.adapter.geometry.AbstractSTGeometryAdapter;
import de.vcs.adapter.geometry.LineAdapter;
import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.model.odr.geometry.AbstractODRGeometry;
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
            switch (name.getLocalPart()) {
                case "geometry":
                    object.getOdrGeometries().add(reader.getObjectUsingBuilder(AbstractSTGeometryAdapter.class));
                    break;
            }
        }
    }
}
