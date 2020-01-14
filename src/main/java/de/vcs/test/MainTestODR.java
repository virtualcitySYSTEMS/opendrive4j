package de.vcs.test;

import de.vcs.model.odr.core.OpenDRIVE;
import de.vcs.model.odr.road.Road;
import org.xmlobjects.XMLObjects;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLReaderFactory;

import java.io.File;

public class MainTestODR {

    public static void main(String[] args) throws Exception {
        XMLObjects xmlObjects = XMLObjects.newInstance();
        XMLReaderFactory factory = XMLReaderFactory.newInstance(xmlObjects);
        OpenDRIVE odr;
        try (XMLReader reader = factory.createReader(new File(
                "src/main/resources/Crossing8Course.xodr"))) {
            odr = xmlObjects.fromXML(reader, OpenDRIVE.class);
        }
        System.out.println(odr.getHeader().getRevMajor());
        for (Road r : odr.getRoads()) {
            r.getLanes().getLaneSections()
                    .forEach(s -> s.getCenterLanes().forEach(l -> System.out.println(l.getType())));
        }
    }
}
