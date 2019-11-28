package de.vcs.model.odr.core;

import de.vcs.model.odr.ODRObject;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public abstract class AbstractOpenDriveElement extends ODRObject {

    private ArrayList<AdditionalData> additionalData;

    public ArrayList<AdditionalData> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(ArrayList<AdditionalData> additionalData) {
        this.additionalData = additionalData;
    }
}