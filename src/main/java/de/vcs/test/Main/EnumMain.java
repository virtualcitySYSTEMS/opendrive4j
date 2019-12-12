package de.vcs.test.Main;

import de.vcs.adapter.helper.EnumChecker;
import de.vcs.model.odr.object.Orientation;
import de.vcs.test.enums.Enum1;
import de.vcs.test.enums.Enum2;

import java.util.ArrayList;

public class EnumMain {

    public static void main(String[] args) {
        ArrayList<Class<? extends Enum<?>>> e = new ArrayList<>();
        e.add(Enum1.class);
        e.add(Enum2.class);
        e.add(Orientation.class);
        System.out.println(EnumChecker.contains("+", Orientation.class));
    }
}
