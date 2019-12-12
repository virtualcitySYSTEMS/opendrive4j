package de.vcs.model.odr.core;

public enum UnitSlope {
    PERCENTAGE("%");
    private String value;

    private UnitSlope(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
