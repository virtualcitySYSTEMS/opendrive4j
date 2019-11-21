package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class Surface extends AbstractOpenDriveElement {

    public ArrayList<SurfaceCRG> crg;

    public Surface() {
    }

    public Surface(ArrayList<SurfaceCRG> crg) {
        this.crg = crg;
    }
}