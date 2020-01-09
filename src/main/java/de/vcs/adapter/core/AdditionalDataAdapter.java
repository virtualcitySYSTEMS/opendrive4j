package de.vcs.adapter.core;

import de.vcs.model.odr.core.AdditionalData;
import de.vcs.util.ODRConstants;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.xml.Attributes;

import javax.xml.namespace.QName;

public class AdditionalDataAdapter implements ObjectBuilder<AdditionalData> {

    @Override
    public AdditionalData createObject(QName name) throws ObjectBuildException {
        return new AdditionalData();
    }

    @Override
    public void buildChildObject(AdditionalData object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "userData":
                    object.getUserData().add(reader.getObjectUsingBuilder(UserDataAdapter.class));
                    break;
                case "include":
                    object.getIncludes().add(reader.getObjectUsingBuilder(IncludeAdapter.class));
                    break;
                case "dataQuality":
                    object.setDataQuality(reader.getObjectUsingBuilder(DataQualityAdapter.class));
                    break;
            }
        }
    }
}
