package de.vcs.model.odr;

import org.xmlobjects.model.Child;

public class ODRObject implements Child {

    private Child parent;

    @Override
    public Child getParent() {
        return parent;
    }

    @Override
    public void setParent(Child parent) {
        this.parent = parent;
    }
}
