package de.vcs.model.odr.core;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class GeoReference extends AbstractOpenDriveElement {

	private String epsg;
	private String proj;

	public GeoReference(){

	}

	public GeoReference(String epsg, String proj) {
		this.epsg = epsg;
		this.proj = proj;
	}

	public String getEpsg() {
		return epsg;
	}

	public void setEpsg(String epsg) {
		this.epsg = epsg;
	}

	public String getProj() {
		return proj;
	}

	public void setProj(String proj) {
		this.proj = proj;
	}
}