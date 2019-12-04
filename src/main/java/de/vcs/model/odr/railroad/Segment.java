package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.geometry.STHPosition;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Segment extends AbstractOpenDriveElement {

    private String roadId;
    private PlatformSide side;
    private STHPosition sStart;
    private STHPosition sEnd;

    public Segment() {
    }

    public Segment(String roadId, PlatformSide side, STHPosition sStart, STHPosition sEnd) {
        this.roadId = roadId;
        this.side = side;
        this.sStart = sStart;
        this.sEnd = sEnd;
    }

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public PlatformSide getSide() {
        return side;
    }

    public void setSide(PlatformSide side) {
        this.side = side;
    }

    public STHPosition getsStart() {
        return sStart;
    }

    public void setsStart(STHPosition sStart) {
        this.sStart = sStart;
    }

    public STHPosition getsEnd() {
        return sEnd;
    }

    public void setsEnd(STHPosition sEnd) {
        this.sEnd = sEnd;
    }
}