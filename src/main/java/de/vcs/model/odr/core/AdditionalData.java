package de.vcs.model.odr.core;

import de.vcs.model.odr.ODRObject;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class AdditionalData extends ODRObject {

    private ArrayList<UserData> userData;
    private ArrayList<Include> includes;
    private ArrayList<DataQuality> dataQualities;

    public AdditionalData() {
    }

    public AdditionalData(ArrayList<UserData> userData, ArrayList<Include> includes,
            ArrayList<DataQuality> dataQualities) {
        this.userData = userData;
        this.includes = includes;
        this.dataQualities = dataQualities;
    }

    public ArrayList<UserData> getUserData() {
        return userData;
    }

    public void setUserData(ArrayList<UserData> userData) {
        this.userData = userData;
    }

    public ArrayList<Include> getIncludes() {
        return includes;
    }

    public void setIncludes(ArrayList<Include> includes) {
        this.includes = includes;
    }

    public ArrayList<DataQuality> getDataQualities() {
        return dataQualities;
    }

    public void setDataQualities(ArrayList<DataQuality> dataQualities) {
        this.dataQualities = dataQualities;
    }
}