package de.vcs.test.model;

import org.xmlobjects.model.Child;
import org.xmlobjects.util.copy.CopyBuilder;
import org.xmlobjects.util.copy.Copyable;

public abstract class TestObject implements Child, Copyable {

    private Child parent;

    @Override
    public Copyable shallowCopy(CopyBuilder builder) {
        return null;
    }

    @Override
    public Copyable deepCopy(CopyBuilder builder) {
        return null;
    }

    @Override
    public Child getParent() {
        return parent;
    }

    @Override
    public void setParent(Child parent) {
        this.parent = parent;
    }
}
