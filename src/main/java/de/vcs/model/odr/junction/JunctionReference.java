package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class JunctionReference extends AbstractOpenDriveElement {

    private String junction;

    public JunctionReference() {
    }

    public JunctionReference(String junction) {
        this.junction = junction;
    }

    public String getJunction() {
        return junction;
    }

    public void setJunction(String junction) {
        this.junction = junction;
    }
}