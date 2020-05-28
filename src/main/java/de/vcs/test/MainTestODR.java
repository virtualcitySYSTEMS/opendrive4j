package de.vcs.test;

import de.vcs.model.odr.core.OpenDRIVE;
import de.vcs.model.odr.geometry.AbstractODRGeometry;
import de.vcs.model.odr.geometry.AbstractSTGeometry;
import de.vcs.model.odr.road.Road;
import org.xmlobjects.XMLObjects;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLReaderFactory;

import java.io.File;
import java.util.Map;

public class MainTestODR {

    public static void main(String[] args) throws Exception {
        XMLObjects xmlObjects = XMLObjects.newInstance();
        XMLReaderFactory factory = XMLReaderFactory.newInstance(xmlObjects);
        OpenDRIVE odr;
        try (XMLReader reader = factory.createReader(new File(
                "src/main/resources/realRoadExample.xodr"))) {
            odr = xmlObjects.fromXML(reader, OpenDRIVE.class);
        }
        System.out.println("header name: " + odr.getHeader().getName());
        for (Road r : odr.getRoads()) {
            System.out.println("===== road id: " + r.getId() + " =====");
            System.out.println(" + preID: " + r.getPredecessorId());
            System.out.println(" + sucID: " + r.getSuccessorId());
            System.out.println(" + type: " + r.getType().get(0).getType());
            System.out.println(" -- planview -- ");
            for (Map.Entry<Double, AbstractODRGeometry> entry : r.getPlanView().getOdrGeometries().entrySet()) {
                AbstractSTGeometry g = (AbstractSTGeometry) entry.getValue();
                System.out.println(g.getClass().getName() + " s: " + g.getLinearReference().getS() +
                        " xy: " + g.getInertialReference().getPos().getValue());
//                if (g instanceof de.vcs.model.odr.geometry.ParamPolynom) {
//                    ((ParamPolynom) g).calcPointList();
//                }
            }
            r.getLanes().getLaneOffsets()
                    .forEach((s, lOffset) -> {
                        System.out.println("-- laneOffset: " + lOffset.getLinearReference().getS() + " --");
                    });
            r.getLanes().getLaneSections()
                    .forEach((s, ls) -> {
                        System.out.println("-- laneSection: " + ls.getLinearReference().getS() + " --");
                        ls.getLeftLanes()
                                .forEach((id, l) -> System.out
                                        .println("left id: " + l.getId() + " type: " + l.getType() +
                                                " width: " +
                                                l.getWidths().floorEntry(0.0).getValue().getStTransform().getsOffset() +
                                                " preID: " + l.getPredecessorId() + " sucID: " + l.getSuccessorId()));
                        System.out.println(
                                "center id: " + ls.getCenterLane().getId() + " type: " + ls.getCenterLane().getType());
                        ls.getRightLanes()
                                .forEach((id, l) -> System.out
                                        .println("right id: " + l.getId() + " type: " + l.getType() +
                                                " width: " +
                                                l.getWidths().floorEntry(0.0).getValue().getStTransform().getsOffset() +
                                                " preID: " + l.getPredecessorId() + " sucID: " + l.getSuccessorId()));
                    });
            System.out.println("-- signals --");
            r.getSignals().getSignals()
                    .forEach(sig -> System.out.println("signalId: " + sig.getId() + " type: " + sig.getType()));
            System.out.println("-- objects --");
            r.getObjects()
                    .forEach(obj -> System.out.println("objectId: " + obj.getId() + " name: " + obj.getName() + " s: " +
                            obj.getLinearReference().getS() + " t: " + obj.getLinearReference().getT()));
        }
    }
}
