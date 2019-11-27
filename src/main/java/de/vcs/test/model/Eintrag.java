package de.vcs.test.model;

import org.xmlobjects.gml.model.geometry.primitives.Point;

public class Eintrag extends TestObject {

    private Stadt stadt;
    private Beschreibung beschreibung;
    private Point point;

    public Eintrag() {
    }

    public Eintrag(Stadt stadt, Beschreibung beschreibung, Point point) {
        this.stadt = stadt;
        this.beschreibung = beschreibung;
        this.point = point;
    }

    public Stadt getStadt() {
        return stadt;
    }

    public void setStadt(Stadt stadt) {
        this.stadt = stadt;
    }

    public Beschreibung getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(Beschreibung beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
