package de.vcs.model.odr.road;

import de.vcs.model.gml.root.GMObject;
import de.vcs.model.odr.core.AdditionalData;
import de.vcs.model.odr.lane.Lanes;
import de.vcs.model.odr.signal.Signals;
import de.vcs.model.odr.railroad.Railroad;
import de.vcs.model.odr.core.AbstractOpenDriveElement;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Road extends AbstractOpenDriveElement {

    /**
     * name of the road
     */
    private String name;
    /**
     * total length of the reference line in the xy-plane
     */
    private double length;
    /**
     * unique ID within database
     * (if it represents an integer number, it should preferably comply to uint32_t
     * and stay within the given range)
     */
    private String id;
    /**
     * ID of the junction to which the road belongs as a connecting road (= -1 for
     * none)
     */
    private String junction;
    /**
     * basic rule for using the road; RHT=right-hand traffic, LHT=left-hand traffic;
     * if this attribute is missing, RHT is assumed
     */
    private TrafficRule rule;
    private Road predecessor;
    private Road successor;
    public ArrayList<SurfaceCRG> CRG;
    public ArrayList<Type> type;
    private LateralProfile lateralProfile;
    private ElevationProfile elevationProfile;
    private PlanView planView;
    private Lanes lanes;
    private Signals signals;
    private Railroad railroad;
    public ArrayList<GMObject> geometry;

    public Road() {
    }

    public Road(String name, double length, String id, String junction, TrafficRule rule,
            Road predecessor, Road successor, ArrayList<SurfaceCRG> CRG,
            ArrayList<Type> type, LateralProfile lateralProfile, ElevationProfile elevationProfile,
            PlanView planView, Lanes lanes, Signals signals, Railroad railroad,
            ArrayList<GMObject> geometry) {
        this.name = name;
        this.length = length;
        this.id = id;
        this.junction = junction;
        this.rule = rule;
        this.predecessor = predecessor;
        this.successor = successor;
        this.CRG = CRG;
        this.type = type;
        this.lateralProfile = lateralProfile;
        this.elevationProfile = elevationProfile;
        this.planView = planView;
        this.lanes = lanes;
        this.signals = signals;
        this.railroad = railroad;
        this.geometry = geometry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJunction() {
        return junction;
    }

    public void setJunction(String junction) {
        this.junction = junction;
    }

    public TrafficRule getRule() {
        return rule;
    }

    public void setRule(TrafficRule rule) {
        this.rule = rule;
    }

    public Road getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Road predecessor) {
        this.predecessor = predecessor;
    }

    public Road getSuccessor() {
        return successor;
    }

    public void setSuccessor(Road successor) {
        this.successor = successor;
    }

    public LateralProfile getLateralProfile() {
        return lateralProfile;
    }

    public void setLateralProfile(LateralProfile lateralProfile) {
        this.lateralProfile = lateralProfile;
    }

    public ElevationProfile getElevationProfile() {
        return elevationProfile;
    }

    public void setElevationProfile(ElevationProfile elevationProfile) {
        this.elevationProfile = elevationProfile;
    }

    public PlanView getPlanView() {
        return planView;
    }

    public void setPlanView(PlanView planView) {
        this.planView = planView;
    }

    public Lanes getLanes() {
        return lanes;
    }

    public void setLanes(Lanes lanes) {
        this.lanes = lanes;
    }

    public Signals getSignals() {
        return signals;
    }

    public void setSignals(Signals signals) {
        this.signals = signals;
    }

    public Railroad getRailroad() {
        return railroad;
    }

    public void setRailroad(Railroad railroad) {
        this.railroad = railroad;
    }
}