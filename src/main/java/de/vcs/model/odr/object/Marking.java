package de.vcs.model.odr.object;

import de.vcs.model.odr.lane.RoadMarkColor;
import de.vcs.model.odr.lane.RoadMarkWeight;

import java.util.ArrayList;

public class Marking extends AbstractObject {

    private String side;
    private String weight;
    private String color;
    private double spaceLength;
    private double lineLength;
    private double startOffset;
    private double stopOffset;
    private ArrayList<CornerReference> cornerReferences;

    public Marking() {
        this.cornerReferences = new ArrayList<CornerReference>();
    }

    public Marking(String side, String weight, String color, double spaceLength, double lineLength,
            double startOffset, double stopOffset,
            ArrayList<CornerReference> cornerReferences) {
        this.side = side;
        this.weight = weight;
        this.color = color;
        this.spaceLength = spaceLength;
        this.lineLength = lineLength;
        this.startOffset = startOffset;
        this.stopOffset = stopOffset;
        this.cornerReferences = cornerReferences;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpaceLength() {
        return spaceLength;
    }

    public void setSpaceLength(double spaceLength) {
        this.spaceLength = spaceLength;
    }

    public double getLineLength() {
        return lineLength;
    }

    public void setLineLength(double lineLength) {
        this.lineLength = lineLength;
    }

    public double getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(double startOffset) {
        this.startOffset = startOffset;
    }

    public double getStopOffset() {
        return stopOffset;
    }

    public void setStopOffset(double stopOffset) {
        this.stopOffset = stopOffset;
    }

    public ArrayList<CornerReference> getCornerReferences() {
        return cornerReferences;
    }

    public void setCornerReferences(ArrayList<CornerReference> cornerReferences) {
        this.cornerReferences = cornerReferences;
    }
}
