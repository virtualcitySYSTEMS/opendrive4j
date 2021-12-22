package de.vcs.test;

import de.vcs.model.odr.core.OpenDRIVE;
import de.vcs.model.odr.geometry.AbstractODRGeometry;
import de.vcs.model.odr.geometry.AbstractSTGeometry;
import de.vcs.model.odr.geometry.Polynom;
import de.vcs.model.odr.geometry.STHPosition;
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
                "src/main/resources/2021-10-26_1500_PLIMOS_Grafing_Prio1.xodr"))) {
            odr = xmlObjects.fromXML(reader, OpenDRIVE.class);
        }
        System.out.println("header name: " + odr.getHeader().getName());
        int nrObjects = 0;
        int nrSignals = 0;
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
            }
            System.out.println(" -- lateralProfile -- ");
            for (Map.Entry<STHPosition, AbstractODRGeometry> entry : r.getLateralProfile().getShapes().entrySet()) {
                STHPosition sthPosition = entry.getKey();
                Polynom g = (Polynom) entry.getValue();
                System.out.println(" s: " + sthPosition.getS() + " t: " + sthPosition.getT() +
                        " abcd: " + g.getA() + " " + g.getB() + " " + g.getC() + " " + g.getD());
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
            System.out.println("-- signals -- " + r.getSignals().getSignals().size());
            nrSignals += r.getSignals().getSignals().size();
            r.getSignals().getSignals()
                    .forEach(sig -> System.out.println("signalId: " + sig.getId() + " type: " + sig.getType()));
            System.out.println("-- objects -- " + r.getObjects().size());
            nrObjects += r.getObjects().size();
            r.getObjects()
                    .forEach(obj -> System.out.println("objectId: " + obj.getId() + " name: " + obj.getName() + " s: " +
                            obj.getLinearReference().getS() + " t: " + obj.getLinearReference().getT()));
        }
        System.out.println(" ---------------------");
        System.out.println("roads: " + odr.getRoads().size());
        System.out.println("objects: " + nrObjects);
        System.out.println("signals: " + nrSignals);
        System.out.println(" ---------------------");
    }
}
