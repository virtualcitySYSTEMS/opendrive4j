package de.vcs.adapter.helper;

import org.xmlobjects.xml.TextContent;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TextContentChecker {

    public static <T extends Enum<T>> void check(TextContent textcontent, ArrayList<Class<? extends Enum<?>>> e,
            Consumer<String> action) {
        if (EnumChecker.contains(textcontent.get(), e)) {
            textcontent.ifPresent(action);
        }
    }

    public static <T extends Enum<T>> void check(TextContent textcontent, Class<? extends Enum<?>> e,
            Consumer<String> action) {
        ArrayList<Class<? extends Enum<?>>> ens = new ArrayList<>();
        ens.add(e);
        if (EnumChecker.contains(textcontent.get(), ens)) {
            textcontent.ifPresent(action);
        }
    }
}
