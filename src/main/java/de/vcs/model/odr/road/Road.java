package road;

import core.AdditionalData;
import lane.Lanes;
import signal.Signals;
import railroad.Railroad;
import core._OpenDriveElement;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Road extends _OpenDriveElement {

	/**
	 * name of the road
	 */
	public string name;
	/**
	 * total length of the reference line in the xy-plane
	 */
	public double length;
	/**
	 * unique ID within database
	 * (if it represents an integer number, it should preferably comply to uint32_t
	 * and stay within the given range)
	 */
	public string id;
	/**
	 * ID of the junction to which the road belongs as a connecting road (= -1 for
	 * none)
	 */
	public string junction;
	/**
	 * basic rule for using the road; RHT=right-hand traffic, LHT=left-hand traffic;
	 * if this attribute is missing, RHT is assumed
	 */
	public TrafficRule rule;
	public Road predecessor;
	public Road successor;
	public AdditionalData m_AdditionalData;
	public SurfaceCRG CRG;
	public Type type;
	public LateralProfile lateralProfile;
	public ElevationProfile elevationProfile;
	public PlanView planView;
	public Lanes lanes;
	public Signals signals;
	public Railroad railroad;
	public GmlGeometry gmlGeometry;

	public Road(){

	}

}