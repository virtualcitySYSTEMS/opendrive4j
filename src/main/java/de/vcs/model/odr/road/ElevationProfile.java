package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractParametricGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class ElevationProfile extends AbstractOpenDriveElement {

    public ArrayList<AbstractParametricGeometry> elevation;

    public ElevationProfile() {
    }

    public ElevationProfile(ArrayList<AbstractParametricGeometry> elevation) {
        this.elevation = elevation;
    }
}