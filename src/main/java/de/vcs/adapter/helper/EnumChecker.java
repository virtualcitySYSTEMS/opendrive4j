package de.vcs.adapter.helper;

import java.util.ArrayList;
import java.util.Arrays;

public class EnumChecker {

    public static boolean contains(String value, ArrayList<Class<? extends Enum<?>>> e
    ) {
        return e.stream().anyMatch(x -> Arrays.stream(x.getEnumConstants())
                .anyMatch(y -> value.equals(((Enum) y).toString())));
    }

    public static boolean contains(String value, Class<? extends Enum<?>> e
    ) {
        return Arrays.stream(e.getEnumConstants())
                .anyMatch(y -> value.equals(((Enum) y).toString()));
    }
}
