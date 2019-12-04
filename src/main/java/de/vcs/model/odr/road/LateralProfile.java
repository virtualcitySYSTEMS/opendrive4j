package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class LateralProfile extends AbstractOpenDriveElement {

    private ArrayList<AbstractODRGeometry> superElevations;
    private ArrayList<AbstractODRGeometry> shapes;

    public LateralProfile() {
    }

    public LateralProfile(ArrayList<AbstractODRGeometry> superElevations,
            ArrayList<AbstractODRGeometry> shapes) {
        this.superElevations = superElevations;
        this.shapes = shapes;
    }

    public ArrayList<AbstractODRGeometry> getSuperElevations() {
        return superElevations;
    }

    public void setSuperElevations(ArrayList<AbstractODRGeometry> superElevations) {
        this.superElevations = superElevations;
    }

    public ArrayList<AbstractODRGeometry> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<AbstractODRGeometry> shapes) {
        this.shapes = shapes;
    }
}