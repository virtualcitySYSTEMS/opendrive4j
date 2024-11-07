package de.vcs.adapter.core;

import de.vcs.model.odr.core.DataQuality;
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
        @XMLElement(name = "dataQuality",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class DataQualityAdapter implements ObjectBuilder<DataQuality> {

    @Override
    public DataQuality createObject(QName name, Object o) throws ObjectBuildException {
        return new DataQuality();
    }

    @Override
    public void buildChildObject(DataQuality object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        if (ODRConstants.ODR_1_6_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "error":
                    object.setError(reader.getObjectUsingBuilder(ErrorAdapter.class));
                    break;
                case "rawData":
                    object.setRawData(reader.getObjectUsingBuilder(RawDataAdapter.class));
                    break;
            }
        }
    }
}
