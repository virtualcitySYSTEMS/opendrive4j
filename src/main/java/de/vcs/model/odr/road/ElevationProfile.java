package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;

import java.util.TreeMap;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class ElevationProfile extends AbstractOpenDriveElement {

    private TreeMap<Double, AbstractODRGeometry> elevations;

    public ElevationProfile() {
        this.elevations = new TreeMap<Double, AbstractODRGeometry>();
    }

    public ElevationProfile(TreeMap<Double, AbstractODRGeometry> elevations) {
        this.elevations = elevations;
    }

    public TreeMap<Double, AbstractODRGeometry> getElevations() {
        return elevations;
    }

    public void setElevations(TreeMap<Double, AbstractODRGeometry> elevations) {
        this.elevations = elevations;
    }
}