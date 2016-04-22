package com.NoeJavaMdc;

/**
 * Created by Noe on 4/21/2016.
 */
public class RoomCarpet {

    private RoomDimension roomDimensions;
    private double costOfCarpet;

    public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {
        super();
        this.roomDimensions = roomDimensions;
        this.costOfCarpet = costOfCarpet;
    }

    public double getTotalCost() {
        return costOfCarpet * roomDimensions.getArea();
    }

    @Override
    public String toString() {
        return "RoomCarpet [roomDimensions=" + roomDimensions
                + ", costOfCarpet=" + costOfCarpet + ", "
                + "total cost=" + getTotalCost() + "]";
    }

}
