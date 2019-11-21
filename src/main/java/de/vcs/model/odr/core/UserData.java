package de.vcs.model.odr.core;


import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class UserData extends AdditionalData {

	private String code;
	private String value;
	public ArrayList<UserDataContent> userDataContent;

	public UserData(){

	}

	public UserData(String code, String value, ArrayList<UserDataContent> userDataContent) {
		this.code = code;
		this.value = value;
		this.userDataContent = userDataContent;
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
}