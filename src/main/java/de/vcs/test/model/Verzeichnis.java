package de.vcs.test.model;

import java.util.ArrayList;

public class Verzeichnis extends TestObject {

    private Titel titel;
    private ArrayList<Eintrag> einraege;

    public Verzeichnis() {
        einraege = new ArrayList<Eintrag>();
    }

    public Verzeichnis(Titel titel, ArrayList<Eintrag> einraege) {
        this.titel = titel;
        this.einraege = einraege;
    }

    public Titel getTitel() {
        return titel;
    }

    public void setTitel(Titel titel) {
        this.titel = titel;
    }

    public ArrayList<Eintrag> getEinraege() {
        return einraege;
    }

    public void setEinraege(ArrayList<Eintrag> einraege) {
        this.einraege = einraege;
    }
}
