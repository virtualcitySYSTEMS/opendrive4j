package de.vcs.test;

import de.vcs.model.odr.core.OpenDRIVE;
import de.vcs.model.odr.geometry.Line;
import de.vcs.model.odr.road.Road;
import de.vcs.test.model.Eintrag;
import de.vcs.test.model.Verzeichnis;
import org.xmlobjects.XMLObjects;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLReaderFactory;

import java.io.File;

public class MainTestODR {

    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------");
        XMLObjects xmlObjects = XMLObjects.newInstance();
        XMLReaderFactory factory = XMLReaderFactory.newInstance(xmlObjects);
        OpenDRIVE odr;
        try (XMLReader reader = factory.createReader(new File(
                "src/main/resources/Crossing8Course.xodr"))) {
            odr = xmlObjects.fromXML(reader, OpenDRIVE.class);
        }
        System.out.println(odr.getHeader().getRevMajor());
        for (Road r : odr.getRoads()) {
            System.out.println("ID: " + r.getId());
            System.out.println("Length: " + r.getLength());
            // System.out.println((Line) r.getPlanView().getOdrGeometries().get(0).getLinearReference());
        }
        System.out.println("----------------------------------------");
    }
}
