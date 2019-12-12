package de.vcs.test.enums;

import de.vcs.adapter.helper.EnumChecker;

import java.util.ArrayList;

public class EnumMain {

    public static void main(String[] args) {
        ArrayList<Class<? extends Enum<?>>> e = new ArrayList<>();
        e.add(Enum1.class);
        e.add(Enum2.class);
        String value = "MAX";
        System.out.println(EnumChecker.contains("Peter", e));
    }
}
