package de.vcs.model.odr.object;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class Bridge extends AbstractObject {

    private BridgeType type;

    public Bridge() {
    }

    public Bridge(BridgeType type) {
        this.type = type;
    }

    public BridgeType getType() {
        return type;
    }

    public void setType(BridgeType type) {
        this.type = type;
    }
}