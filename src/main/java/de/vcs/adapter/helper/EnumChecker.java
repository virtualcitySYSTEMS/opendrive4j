package de.vcs.adapter.helper;

import java.util.ArrayList;
import java.util.EnumSet;

public class EnumChecker {

    public static boolean contains(String value, ArrayList<EnumSet> enumSets
    ) {
        return enumSets.forEach(enumSet -> enumSet.stream().anyMatch(x -> Enum.valueOf(x.getClass(), value));
    }
}
