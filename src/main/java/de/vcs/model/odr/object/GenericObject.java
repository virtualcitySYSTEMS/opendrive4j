package de.vcs.model.odr.object;

import de.vcs.model.odr.geometry.STHRepeat;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class GenericObject extends AbstractObject {

    private String type;
    private String subtype;
    private boolean dynamic;
    private ArrayList<STHRepeat> repeats;

    public GenericObject() {
        this.repeats = new ArrayList<STHRepeat>();
    }

    public GenericObject(String type, String subtype, boolean dynamic,
            ArrayList<STHRepeat> repeats) {
        this.type = type;
        this.subtype = subtype;
        this.dynamic = dynamic;
        this.repeats = repeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public ArrayList<STHRepeat> getRepeats() {
        return repeats;
    }

    public void setRepeats(ArrayList<STHRepeat> repeats) {
        this.repeats = repeats;
    }
}