package de.vcs.model.odr.junction;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public class PredecessorSuccessor extends AbstractOpenDriveElement {

    private String elementType = "road";
    private String elementId;
    private double elementS;
    private String elementDir;

    public PredecessorSuccessor() {
    }

    public PredecessorSuccessor(String elementType, String elementId, double elementS, String elementDir) {
        this.elementType = elementType;
        this.elementId = elementId;
        this.elementS = elementS;
        this.elementDir = elementDir;
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

    public double getElementS() {
        return elementS;
    }

    public void setElementS(double elementS) {
        this.elementS = elementS;
    }

    public String getElementDir() {
        return elementDir;
    }

    public void setElementDir(String elementDir) {
        this.elementDir = elementDir;
    }
}