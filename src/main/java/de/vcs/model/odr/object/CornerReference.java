package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

public class CornerReference extends AbstractOpenDriveElement {

    private String outlinePointId;

    public CornerReference() {
    }

    public CornerReference(String outlinePointId) {
        this.outlinePointId = outlinePointId;
    }

    public String getOutlinePointId() {
        return outlinePointId;
    }

    public void setOutlinePointId(String outlinePointId) {
        this.outlinePointId = outlinePointId;
    }
}
