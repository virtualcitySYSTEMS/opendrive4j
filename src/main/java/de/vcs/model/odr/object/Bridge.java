package de.vcs.model.odr.object;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Bridge extends AbstractObject {

    private String type;

    public Bridge() {
    }

    public Bridge(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}