package de.vcs.model.odr.core;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class Include extends AdditionalData {

	private String file;

	public Include(){

	}

	public Include(String file) {
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
}