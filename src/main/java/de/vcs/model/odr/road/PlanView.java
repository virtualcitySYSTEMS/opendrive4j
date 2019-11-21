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
public class PlanView extends AbstractOpenDriveElement {

    public ArrayList<AbstractParametricGeometry> geometry;

    public PlanView() {
    }

    public PlanView(ArrayList<AbstractParametricGeometry> geometry) {
        this.geometry = geometry;
    }
}