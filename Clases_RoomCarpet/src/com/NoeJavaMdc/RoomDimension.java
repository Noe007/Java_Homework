package com.NoeJavaMdc;

/**
 * Created by Noe on 4/21/2016.
 */
public class RoomDimension {

    private double length;
    private double width;

    public RoomDimension(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "RoomDimension [length=" + length + ", width=" + width + "]";
    }


}