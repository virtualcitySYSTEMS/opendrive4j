package de.vcs.model.odr.object;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public enum Orientation {

	PLUS("+"),
	MINUS("-"),
	NONE("none");

	private String value;
	private Orientation(String value) {
		this.value = value;
	}

	public String toString() {
		return  this.value;
	}
}