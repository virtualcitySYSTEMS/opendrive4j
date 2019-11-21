package de.vcs.model.odr.object;

import de.vcs.model.odr.core.AdditionalData;

import java.util.ArrayList;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Object extends AbstractObject {

    private ObjectType type;
    private String subtype;
    private boolean dynamic;
    public ArrayList<RepeatedObject> repeat;

    public Object() {
    }

    public Object(ObjectType type, String subtype, boolean dynamic, ArrayList<RepeatedObject> repeat) {
        this.type = type;
        this.subtype = subtype;
        this.dynamic = dynamic;
        this.repeat = repeat;
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
}