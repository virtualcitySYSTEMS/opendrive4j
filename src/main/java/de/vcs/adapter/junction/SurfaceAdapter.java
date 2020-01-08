package de.vcs.adapter.junction;

import de.vcs.model.odr.junction.Surfaces;
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
        @XMLElement(name = "surface",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SurfaceAdapter implements ObjectBuilder<Surfaces> {

    @Override
    public Surfaces createObject(QName name) throws ObjectBuildException {
        return new Surfaces();
    }

    @Override
    public void buildChildObject(Surfaces object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "CRG":
                    object.getCrg().add(reader.getObjectUsingBuilder(SurfaceCRGAdapter.class));
                    break;
            }
        }
    }
}
