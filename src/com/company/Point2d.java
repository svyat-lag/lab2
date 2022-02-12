package com.company;

public class Point2d {
    private double xCoordinate;
    private double yCoordinate;

    // Defines 2D-point's model with coordinates
    public Point2d(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Defines 2D-point's model without coordinates (default set to 0)
    public Point2d(){
        this(0.0,0.0);
    }

    // Get the current coordinate of the current 2D-point
    public double getX(){
        return xCoordinate;
    }
    public double getY(){
        return yCoordinate;
    }

    // Set the current coordinate of the current 2D-point
    public void setX(double xCoordinate) { this.xCoordinate = xCoordinate; }
    public void setY(double yCoordinate) { this.yCoordinate = yCoordinate; }
}
