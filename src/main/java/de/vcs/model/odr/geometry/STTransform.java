package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class STTransform extends AbstractTransformation {

	private double sOffset;
	private double tOffset;
	private double hOffset;

	public STTransform(){

	}

	public STTransform(double sOffset, double tOffset, double hOffset) {
		this.sOffset = sOffset;
		this.tOffset = tOffset;
		this.hOffset = hOffset;
	}

	public double getsOffset() {
		return sOffset;
	}

	public void setsOffset(double sOffset) {
		this.sOffset = sOffset;
	}

	public double gettOffset() {
		return tOffset;
	}

	public void settOffset(double tOffset) {
		this.tOffset = tOffset;
	}

	public double gethOffset() {
		return hOffset;
	}

	public void sethOffset(double hOffset) {
		this.hOffset = hOffset;
	}
}