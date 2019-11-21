package de.vcs.model.odr.object;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class ParkingSpace extends AbstractObject {

    private ParkingSpaceAccess access;
    private String restrictions;

    public ParkingSpace() {
    }

    public ParkingSpace(ParkingSpaceAccess access, String restrictions) {
        this.access = access;
        this.restrictions = restrictions;
    }

    public ParkingSpaceAccess getAccess() {
        return access;
    }

    public void setAccess(ParkingSpaceAccess access) {
        this.access = access;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }
}