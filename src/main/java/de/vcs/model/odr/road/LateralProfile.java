package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;

import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class LateralProfile extends AbstractOpenDriveElement {

    private TreeMap<Double, AbstractODRGeometry> superElevations;
    private TreeMap<Double, TreeMap<Double, AbstractODRGeometry>> shapes;

    public LateralProfile() {
        this.superElevations = new TreeMap<Double, AbstractODRGeometry>();
        this.shapes = new TreeMap<Double, TreeMap<Double, AbstractODRGeometry>>();
    }

    public LateralProfile(TreeMap<Double, AbstractODRGeometry> superElevations,
            TreeMap<Double, TreeMap<Double, AbstractODRGeometry>> shapes) {
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

    public TreeMap<Double, TreeMap<Double, AbstractODRGeometry>> getShapes() {
        return shapes;
    }

    public void setShapes(TreeMap<Double, TreeMap<Double, AbstractODRGeometry>> shapes) {
        this.shapes = shapes;
    }
}