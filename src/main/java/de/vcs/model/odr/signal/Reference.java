package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Reference extends AbstractOpenDriveElement {

    private String elementType;
    private String elementId;
    private String type;

    public Reference() {
    }

    public Reference(String elementType, String elementId, String type) {
        this.elementType = elementType;
        this.elementId = elementId;
        this.type = type;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}