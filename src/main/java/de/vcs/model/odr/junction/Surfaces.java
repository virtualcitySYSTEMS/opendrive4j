package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class Surfaces extends AbstractOpenDriveElement {

    private ArrayList<SurfaceCRG> crg;

    public Surfaces() {
    }

    public Surfaces(ArrayList<SurfaceCRG> crg) {
        this.crg = crg;
    }

    public ArrayList<SurfaceCRG> getCrg() {
        return crg;
    }

    public void setCrg(ArrayList<SurfaceCRG> crg) {
        this.crg = crg;
    }
}