package de.vcs.model.odr.object;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class GenericObject extends AbstractObject {

    private ObjectType type;
    private String subtype;
    private boolean dynamic;
    private ArrayList<RepeatedObject> repeats;

    public GenericObject() {
    }

    public GenericObject(ObjectType type, String subtype, boolean dynamic,
            ArrayList<RepeatedObject> repeats) {
        this.type = type;
        this.subtype = subtype;
        this.dynamic = dynamic;
        this.repeats = repeats;
    }

    public ObjectType getType() {
        return type;
    }

    public void setType(ObjectType type) {
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

    public ArrayList<RepeatedObject> getRepeats() {
        return repeats;
    }

    public void setRepeats(ArrayList<RepeatedObject> repeats) {
        this.repeats = repeats;
    }
}