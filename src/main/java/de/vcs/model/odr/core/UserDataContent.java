package de.vcs.model.odr.core;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class UserDataContent {

	private String content;

	public UserDataContent(){

	}

	public UserDataContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}