package de.vcs.model.odr.railroad;

import de.vcs.model.odr.core.AbstractOpenDriveElement;
import de.vcs.model.odr.core.AdditionalData;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:47
 */
public class Switch extends AbstractOpenDriveElement {

    private String name;
    private String id;
    private String position;
    private MainTrack mainTrack;
    private SideTrack sideTrack;
    private Partner partner;

    public Switch() {
        this.mainTrack = new MainTrack();
        this.sideTrack = new SideTrack();
        this.partner = new Partner();
    }

    public Switch(String name, String id, String position, MainTrack mainTrack,
            SideTrack sideTrack, Partner partner) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.mainTrack = mainTrack;
        this.sideTrack = sideTrack;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public MainTrack getMainTrack() {
        return mainTrack;
    }

    public void setMainTrack(MainTrack mainTrack) {
        this.mainTrack = mainTrack;
    }

    public SideTrack getSideTrack() {
        return sideTrack;
    }

    public void setSideTrack(SideTrack sideTrack) {
        this.sideTrack = sideTrack;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }
}