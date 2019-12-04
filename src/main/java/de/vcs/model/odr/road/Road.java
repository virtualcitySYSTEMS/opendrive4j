package de.vcs.model.odr.road;

import de.vcs.model.odr.lane.Lanes;
import de.vcs.model.odr.object.AbstractObject;
import de.vcs.model.odr.signal.Signals;
import de.vcs.model.odr.railroad.Railroad;
import de.vcs.model.odr.core.AbstractOpenDriveElement;
import org.xmlobjects.gml.model.GMLObject;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:21
 */
public class Road extends AbstractOpenDriveElement {

    private String name;
    private double length;
    private String id;
    private String junction;
    private TrafficRule rule;
    private String predecessorId;
    private String successorId;
    private ArrayList<SurfaceCRG> CRG;
    private ArrayList<Type> type;
    private LateralProfile lateralProfile;
    private ElevationProfile elevationProfile;
    private PlanView planView;
    private Lanes lanes;
    private Signals signals;
    private Railroad railroad;
    private ArrayList<GMLObject> gmlGeometries;
    private ArrayList<AbstractObject> objects;

    public Road() {
    }

    public Road(String name, double length, String id, String junction, TrafficRule rule, String predecessorId,
            String successorId, ArrayList<SurfaceCRG> CRG, ArrayList<Type> type,
            LateralProfile lateralProfile, ElevationProfile elevationProfile, PlanView planView,
            Lanes lanes, Signals signals, Railroad railroad,
            ArrayList<GMLObject> gmlGeometries, ArrayList<AbstractObject> objects) {
        this.name = name;
        this.length = length;
        this.id = id;
        this.junction = junction;
        this.rule = rule;
        this.predecessorId = predecessorId;
        this.successorId = successorId;
        this.CRG = CRG;
        this.type = type;
        this.lateralProfile = lateralProfile;
        this.elevationProfile = elevationProfile;
        this.planView = planView;
        this.lanes = lanes;
        this.signals = signals;
        this.railroad = railroad;
        this.gmlGeometries = gmlGeometries;
        this.objects = objects;
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

    public String getPredecessorId() {
        return predecessorId;
    }

    public void setPredecessorId(String predecessorId) {
        this.predecessorId = predecessorId;
    }

    public String getSuccessorId() {
        return successorId;
    }

    public void setSuccessorId(String successorId) {
        this.successorId = successorId;
    }

    public ArrayList<SurfaceCRG> getCRG() {
        return CRG;
    }

    public void setCRG(ArrayList<SurfaceCRG> CRG) {
        this.CRG = CRG;
    }

    public ArrayList<Type> getType() {
        return type;
    }

    public void setType(ArrayList<Type> type) {
        this.type = type;
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

    public ArrayList<GMLObject> getGmlGeometries() {
        return gmlGeometries;
    }

    public void setGmlGeometries(ArrayList<GMLObject> gmlGeometries) {
        this.gmlGeometries = gmlGeometries;
    }

    public ArrayList<AbstractObject> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<AbstractObject> objects) {
        this.objects = objects;
    }
}