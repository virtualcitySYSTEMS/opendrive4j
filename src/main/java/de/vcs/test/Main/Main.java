package de.vcs.test.Main;

import de.vcs.test.model.Eintrag;
import de.vcs.test.model.Verzeichnis;
import org.xmlobjects.XMLObjects;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLReaderFactory;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------");
        XMLObjects xmlObjects = XMLObjects.newInstance();
        XMLReaderFactory factory = XMLReaderFactory.newInstance(xmlObjects);
        Verzeichnis verzeichnis;
        try (XMLReader reader = factory.createReader(new File("src/main/resources/test.xml"))) {
            verzeichnis = xmlObjects.fromXML(reader, Verzeichnis.class);
        }
        System.out.println(verzeichnis.getTitel().getName());
        for (Eintrag e : verzeichnis.getEinraege()) {
            System.out.println(e.getStadt().getName());
            System.out.println(e.getBeschreibung().getText());
            System.out.println(e.getPoint().getPos().getValue());
        }
        System.out.println("----------------------------------------");
    }
}
