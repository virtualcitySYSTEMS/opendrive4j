package de.vcs.adapter.core;

import de.vcs.adapter.helper.TextContentChecker;
import de.vcs.model.odr.core.PostProcessing;
import de.vcs.model.odr.core.RawData;
import de.vcs.model.odr.core.Source;
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
        @XMLElement(name = "rawData",
                namespaceURI = ODRConstants.ODR_1_6_NAMESPACE)
})
public class RawDataAdapter implements ObjectBuilder<RawData> {

    @Override
    public RawData createObject(QName name, Object o) throws ObjectBuildException {
        return new RawData();
    }

    @Override
    public void initializeObject(RawData object, QName name, Attributes attributes, XMLReader reader)
            throws ObjectBuildException, XMLReadException {
        attributes.getValue("date").ifPresent(object::setDate);
        TextContentChecker.check(attributes.getValue("source"), Source.class, object::setSource);
        attributes.getValue("sourceComment").ifPresent(object::setSourceComment);
        TextContentChecker
                .check(attributes.getValue("postProcessing"), PostProcessing.class, object::setPostProcessing);
        attributes.getValue("postPrcessingComment").ifPresent(object::setPostProcessingComment);
    }
}
