package de.vcs.adapter.road;

import de.vcs.adapter.geometry.InertialTransformAdapter;
import de.vcs.adapter.geometry.STHPositionAdapter;
import de.vcs.adapter.geometry.STTransformAdapter;
import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.junction.CRGMode;
import de.vcs.model.odr.junction.CRGPurpose;
import de.vcs.model.odr.road.Direction;
import de.vcs.model.odr.road.SurfaceCRG;
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
        TextContentChecker.check(attributes.getValue("orientation"), Direction.class, object::setOrientation);
        TextContentChecker.check(attributes.getValue("mode"), CRGMode.class, object::setMode);
        TextContentChecker.check(attributes.getValue("purpose"), CRGPurpose.class, object::setPurpose);
        attributes.getValue("zScale").ifDouble(object::setzScale);
        attributes.getValue("sStart").ifDouble(object.getsStart()::setS);
        attributes.getValue("sEnd").ifDouble(object.getsEnd()::setS);
        attributes.getValue("sOffset").ifDouble(object.getStTransform()::setsOffset);
        attributes.getValue("tOffset").ifDouble(object.getStTransform()::settOffset);
        attributes.getValue("hOffset").ifDouble(object.getStTransform()::sethOffset);
        attributes.getValue("zOffset").ifDouble(object.getInertialTransform()::setzOffset);
    }

    @Override
    public void buildChildObject(SurfaceCRG object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "sStart":
                    object.setsStart(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
                case "sEnd":
                    object.setsEnd(reader.getObjectUsingBuilder(STHPositionAdapter.class));
                    break;
                case "stTransform":
                    object.setStTransform(reader.getObjectUsingBuilder(STTransformAdapter.class));
                    break;
                case "inertialTransform":
                    object.setInertialTransform(reader.getObjectUsingBuilder(InertialTransformAdapter.class));
                    break;
            }
        }
    }
}
