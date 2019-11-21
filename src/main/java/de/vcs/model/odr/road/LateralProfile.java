package de.vcs.model.odr.road;

import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.AbstractParametricGeometry;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class LateralProfile extends AbstractOpenDriveElement {

    public ArrayList<AbstractParametricGeometry> superElevations;
    public ArrayList<AbstractParametricGeometry> shapes;

    public LateralProfile() {
    }

    public LateralProfile(ArrayList<AbstractParametricGeometry> superElevations,
            ArrayList<AbstractParametricGeometry> shapes) {
        this.superElevations = superElevations;
        this.shapes = shapes;
    }
}