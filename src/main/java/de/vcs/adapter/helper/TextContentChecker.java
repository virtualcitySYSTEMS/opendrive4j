package de.vcs.adapter.helper;

import org.xmlobjects.xml.TextContent;

import java.util.function.Consumer;

public class TextContentChecker {

    public static <T extends Enum<T>> void check(TextContent textcontent, Class<T> enumClass,
            Consumer<String> action) {
        if (EnumChecker.contains(textcontent.get(), enumClass)) {
            textcontent.ifPresent(action);
        }
    }
}
