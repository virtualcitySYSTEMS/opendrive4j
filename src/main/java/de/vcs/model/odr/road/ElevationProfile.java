package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractODRGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class ElevationProfile extends AbstractOpenDriveElement {

    private ArrayList<AbstractODRGeometry> elevations;

    public ElevationProfile() {
        this.elevations = new ArrayList<AbstractODRGeometry>();
    }

    public ElevationProfile(ArrayList<AbstractODRGeometry> elevations) {
        this.elevations = elevations;
    }

    public ArrayList<AbstractODRGeometry> getElevations() {
        return elevations;
    }

    public void setElevations(ArrayList<AbstractODRGeometry> elevations) {
        this.elevations = elevations;
    }
}