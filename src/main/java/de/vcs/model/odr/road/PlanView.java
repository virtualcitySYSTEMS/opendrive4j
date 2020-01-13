package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class PlanView extends AbstractOpenDriveElement {

    private ArrayList<AbstractODRGeometry> odrGeometries;

    public PlanView() {
        this.odrGeometries = new ArrayList<AbstractODRGeometry>();
    }

    public PlanView(ArrayList<AbstractODRGeometry> odrGeometries) {
        this.odrGeometries = odrGeometries;
    }

    public ArrayList<AbstractODRGeometry> getOdrGeometries() {
        return odrGeometries;
    }

    public void setOdrGeometries(ArrayList<AbstractODRGeometry> odrGeometries) {
        this.odrGeometries = odrGeometries;
    }
}