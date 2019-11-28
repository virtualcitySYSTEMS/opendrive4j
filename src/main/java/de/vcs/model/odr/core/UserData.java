package de.vcs.model.odr.core;

import de.vcs.model.odr.ODRObject;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class UserData extends ODRObject {

    private String code;
    private String value;
    private ArrayList<UserDataContent> userDataContents;

    public UserData() {
    }

    public UserData(String code, String value, ArrayList<UserDataContent> userDataContents) {
        this.code = code;
        this.value = value;
        this.userDataContents = userDataContents;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<UserDataContent> getUserDataContents() {
        return userDataContents;
    }

    public void setUserDataContents(ArrayList<UserDataContent> userDataContents) {
        this.userDataContents = userDataContents;
    }
}