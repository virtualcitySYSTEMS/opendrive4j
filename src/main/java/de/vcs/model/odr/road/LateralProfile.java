package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;
import de.vcs.model.odr.geometry.STHPosition;

import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class LateralProfile extends AbstractOpenDriveElement {

    private TreeMap<Double, AbstractODRGeometry> superElevations;
    private TreeMap<STHPosition, AbstractODRGeometry> shapes;

    public LateralProfile() {
        this.superElevations = new TreeMap<Double, AbstractODRGeometry>();
        this.shapes = new TreeMap<STHPosition, AbstractODRGeometry>();
    }

    public LateralProfile(TreeMap<Double, AbstractODRGeometry> superElevations,
            TreeMap<STHPosition, AbstractODRGeometry> shapes) {
        this.superElevations = superElevations;
        this.shapes = shapes;
    }

    public TreeMap<Double, AbstractODRGeometry> getSuperElevations() {
        return superElevations;
    }

    public void setSuperElevations(
            TreeMap<Double, AbstractODRGeometry> superElevations) {
        this.superElevations = superElevations;
    }

    public TreeMap<STHPosition, AbstractODRGeometry> getShapes() {
        return shapes;
    }

    public void setShapes(TreeMap<STHPosition, AbstractODRGeometry> shapes) {
        this.shapes = shapes;
    }
}