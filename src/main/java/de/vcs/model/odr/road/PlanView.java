package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;

import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class PlanView extends AbstractOpenDriveElement {

    private TreeMap<Double, AbstractODRGeometry> odrGeometries;

    public PlanView() {
        this.odrGeometries = new TreeMap<Double, AbstractODRGeometry>();
    }

    public PlanView(TreeMap<Double, AbstractODRGeometry> odrGeometries) {
        this.odrGeometries = odrGeometries;
    }

    public TreeMap<Double, AbstractODRGeometry> getOdrGeometries() {
        return odrGeometries;
    }

    public void setOdrGeometries(
            TreeMap<Double, AbstractODRGeometry> odrGeometries) {
        this.odrGeometries = odrGeometries;
    }
}