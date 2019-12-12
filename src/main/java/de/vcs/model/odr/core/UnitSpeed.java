package de.vcs.model.odr.core;

public enum UnitSpeed {
    MS("m/s"),
    MPH("mph"),
    KMH("km/h");
    private String value;

    private UnitSpeed(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
