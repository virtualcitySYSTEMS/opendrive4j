package de.vcs.model.odr.core;

import java.util.ArrayList;

public class UnitEnumCollection extends ArrayList<Class<? extends Enum<?>>> {

    private UnitEnumCollection() {
        super();
        this.init();
    }

    public void init() {
        add(UnitSpeed.class);
        add(UnitDistance.class);
        add(UnitMass.class);
        add(UnitSlope.class);
    }

    public static ArrayList<Class<? extends Enum<?>>> getUnitEnums() {
        return new UnitEnumCollection();
    }
}
