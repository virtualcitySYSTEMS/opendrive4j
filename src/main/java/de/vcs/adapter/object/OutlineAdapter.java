package de.vcs.adapter.object;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.lane.LaneType;
import de.vcs.model.odr.object.Outline;
import de.vcs.model.odr.object.OutlineFillType;
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
        @XMLElement(name = "outlines",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class OutlineAdapter implements ObjectBuilder<Outline> {

    @Override
    public Outline createObject(QName name, Object o) throws ObjectBuildException {
        return new Outline();
    }

    @Override
    public void initializeObject(Outline object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("id").ifInteger(object::setId);
        TextContentChecker.check(attributes.getValue("fillType"), OutlineFillType.class, object::setFillType);
        attributes.getValue("outer").ifBoolean(object::setOuter);
        attributes.getValue("closed").ifBoolean(object::setClosed);
        TextContentChecker.check(attributes.getValue("laneType"), LaneType.class, object::setLaneType);
    }

    @Override
    public void buildChildObject(Outline object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "cornerLocal":
                    object.getCornerLocal().add(reader.getObjectUsingBuilder(CornerLocalAdapter.class));
                    break;
                case "cornerRoad":
                    object.getCornerRoad().add(reader.getObjectUsingBuilder(CornerRoadAdapter.class));
                    break;
            }
        }
    }
}
