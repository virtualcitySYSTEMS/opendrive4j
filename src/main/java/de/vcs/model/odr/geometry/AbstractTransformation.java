package de.vcs.model.odr.geometry;


/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public abstract class AbstractTransformation extends AbstractGeometry {

	private double hdg;
	private double pitch;
	private double roll;

	public double getHdg() {
		return hdg;
	}

	public void setHdg(double hdg) {
		this.hdg = hdg;
	}

	public double getPitch() {
		return pitch;
	}

	public void setPitch(double pitch) {
		this.pitch = pitch;
	}

	public double getRoll() {
		return roll;
	}

	public void setRoll(double roll) {
		this.roll = roll;
	}
}