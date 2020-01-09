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
    private DataQuality dataQuality;

    public AdditionalData() {
        this.userData = new ArrayList<UserData>();
        this.includes = new ArrayList<Include>();
    }

    public AdditionalData(ArrayList<UserData> userData, ArrayList<Include> includes,
            DataQuality dataQuality) {
        this.userData = userData;
        this.includes = includes;
        this.dataQuality = dataQuality;
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

    public DataQuality getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(DataQuality dataQuality) {
        this.dataQuality = dataQuality;
    }
}