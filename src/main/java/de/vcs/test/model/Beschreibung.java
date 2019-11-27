package de.vcs.test.model;

public class Beschreibung extends TestObject {

    private String text;

    public Beschreibung() {
    }

    public Beschreibung(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
