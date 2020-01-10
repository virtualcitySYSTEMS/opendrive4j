package de.vcs.model.odr.object;

import java.util.ArrayList;

public class Border extends AbstractObject {

    private String type;
    private int outlineId;
    private boolean useCompleteOutline;
    private ArrayList<CornerReference> cornerReferences;

    public Border() {
        this.cornerReferences = new ArrayList<CornerReference>();
    }

    public Border(String type, int outlineId, boolean useCompleteOutline,
            ArrayList<CornerReference> cornerReferences) {
        this.type = type;
        this.outlineId = outlineId;
        this.useCompleteOutline = useCompleteOutline;
        this.cornerReferences = cornerReferences;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOutlineId() {
        return outlineId;
    }

    public void setOutlineId(int outlineId) {
        this.outlineId = outlineId;
    }

    public boolean isUseCompleteOutline() {
        return useCompleteOutline;
    }

    public void setUseCompleteOutline(boolean useCompleteOutline) {
        this.useCompleteOutline = useCompleteOutline;
    }

    public ArrayList<CornerReference> getCornerReferences() {
        return cornerReferences;
    }

    public void setCornerReferences(ArrayList<CornerReference> cornerReferences) {
        this.cornerReferences = cornerReferences;
    }
}
