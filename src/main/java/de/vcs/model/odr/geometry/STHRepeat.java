package de.vcs.model.odr.geometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:41
 */
public class STHRepeat extends AbstractODRGeometry {

    private double length;
    private double distance;
    private double heightStart;
    private double heightEnd;
    private double widthStart;
    private double widthEnd;
    private double lengthStart;
    private double lengthEnd;
    private double radiusStart;
    private double radiusEnd;
    private STHPosition linearReference;
    private STHPosition start;
    private STHPosition end;

    public STHRepeat() {
        this.linearReference = new STHPosition();
        this.start = new STHPosition();
        this.end = new STHPosition();
    }

    public STHRepeat(double length, double distance,
            double heightStart, double heightEnd, double widthStart, double widthEnd, double lengthStart,
            double lengthEnd,
            double radiusStart, double radiusEnd, STHPosition linearReference, STHPosition start,
            STHPosition end) {
        this.length = length;
        this.distance = distance;
        this.heightStart = heightStart;
        this.heightEnd = heightEnd;
        this.widthStart = widthStart;
        this.widthEnd = widthEnd;
        this.lengthStart = lengthStart;
        this.lengthEnd = lengthEnd;
        this.radiusStart = radiusStart;
        this.radiusEnd = radiusEnd;
        this.linearReference = linearReference;
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getHeightStart() {
        return heightStart;
    }

    public void setHeightStart(double heightStart) {
        this.heightStart = heightStart;
    }

    public double getHeightEnd() {
        return heightEnd;
    }

    public void setHeightEnd(double heightEnd) {
        this.heightEnd = heightEnd;
    }

    public double getWidthStart() {
        return widthStart;
    }

    public void setWidthStart(double widthStart) {
        this.widthStart = widthStart;
    }

    public double getWidthEnd() {
        return widthEnd;
    }

    public void setWidthEnd(double widthEnd) {
        this.widthEnd = widthEnd;
    }

    public double getLengthStart() {
        return lengthStart;
    }

    public void setLengthStart(double lengthStart) {
        this.lengthStart = lengthStart;
    }

    public double getLengthEnd() {
        return lengthEnd;
    }

    public void setLengthEnd(double lengthEnd) {
        this.lengthEnd = lengthEnd;
    }

    public double getRadiusStart() {
        return radiusStart;
    }

    public void setRadiusStart(double radiusStart) {
        this.radiusStart = radiusStart;
    }

    public double getRadiusEnd() {
        return radiusEnd;
    }

    public void setRadiusEnd(double radiusEnd) {
        this.radiusEnd = radiusEnd;
    }

    public STHPosition getLinearReference() {
        return linearReference;
    }

    public void setLinearReference(STHPosition linearReference) {
        this.linearReference = linearReference;
    }

    public STHPosition getStart() {
        return start;
    }

    public void setStart(STHPosition start) {
        this.start = start;
    }

    public STHPosition getEnd() {
        return end;
    }

    public void setEnd(STHPosition end) {
        this.end = end;
    }
}
