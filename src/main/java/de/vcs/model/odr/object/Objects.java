package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

public class Objects extends AbstractOpenDriveElement {

    private ArrayList<AbstractObject> objects;

    public Objects() {
        this.objects = new ArrayList<AbstractObject>();
    }

    public Objects(ArrayList<AbstractObject> objects) {
        this.objects = objects;
    }

    public ArrayList<AbstractObject> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<AbstractObject> objects) {
        this.objects = objects;
    }
}
