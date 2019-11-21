package de.vcs.model.odr.signal;

import de.vcs.model.odr.core.AbstractOpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:35
 */
public class Control extends AbstractOpenDriveElement {

    private String signalId;
    private String type;

    public Control() {
    }

    public Control(String signalId, String type) {
        this.signalId = signalId;
        this.type = type;
    }

    public String getSignalId() {
        return signalId;
    }

    public void setSignalId(String signalId) {
        this.signalId = signalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}