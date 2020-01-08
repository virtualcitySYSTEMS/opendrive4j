package de.vcs.adapter.junction;

import de.vcs.adapter.geometry.STTransformAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.geometry.STTransform;
import de.vcs.model.odr.junction.CRGMode;
import de.vcs.model.odr.junction.CRGPurpose;
import de.vcs.model.odr.junction.SurfaceCRG;
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
        @XMLElement(name = "CRG",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class SurfaceCRGAdapter implements ObjectBuilder<SurfaceCRG> {

    @Override
    public SurfaceCRG createObject(QName name) throws ObjectBuildException {
        return new SurfaceCRG();
    }

    @Override
    public void initializeObject(SurfaceCRG object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("file").ifPresent(object::setFile);
        TextContentChecker.check(attributes.getValue("mode"), CRGMode.class, object::setMode);
        TextContentChecker.check(attributes.getValue("purpsose"), CRGPurpose.class, object::setPurpose);
        attributes.getValue("zScale").ifDouble(object::setzScale);
        attributes.getValue("zOffset").ifDouble(object.getStTransform()::sethOffset);
    }

    @Override
    public void buildChildObject(SurfaceCRG object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "stTransform":
                    object.setStTransform(reader.getObjectUsingBuilder(STTransformAdapter.class));
                    break;
            }
        }
    }
}
