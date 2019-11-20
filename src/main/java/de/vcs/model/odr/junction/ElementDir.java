package de.vcs.model.odr.junction;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:50
 */
public enum ElementDir {
	PLUS("+"),
	MINUS("-");

	private String value;
	private ElementDir(String value) {
		this.value = value;
	}

	public String toString() {
		return  this.value;
	}
}