package com.company;

import static java.lang.Math.sqrt;

// Let user create 3D-point object & get or set its coordinates
// & calculate distance between two objects (3D-points) & calculate the area of a triangle
public class Point3d extends Point2d {
    private double zCoordinate;

    // Defines 3D-point's model with coordinates
    public Point3d(double xCoordinate, double yCoordinate, double zCoordinate){
        super(xCoordinate, yCoordinate);
        this.zCoordinate = zCoordinate;
    }

    // Defines 3D-point's model without coordinates (default set to 0)
    public Point3d(){
        this(0.0,0.0,0.0);
    }

    // Get the current coordinate of the current 3D-point
    public double getZ(){
        return zCoordinate;
    }

    // Set the current coordinate of the current 3D-point
    public void setZ(double zCoordinate){
        this.zCoordinate = zCoordinate;
    }

    // Defines whether one point is equal to another one or not
    public boolean equalTo(Point3d point1){
        if ((point1.getX() == this.getX()) && (point1.getY() == this.getY()) && (point1.getZ() == this.getZ()))
            return true;
        else
            return false;
    }

    // Calculates distance between to points
    public double distanceTo(Point3d point1, Point3d point2){
        double x1 = point1.getX(), y1 = point1.getY(), z1 = point1.getZ();
        double x2 = point2.getX(), y2 = point2.getY(), z2 = point2.getZ();
        return sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) + (z2-z1)*(z2-z1));
    }

    // Calculates the area of a triangle given by three points
    public double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double a = distanceTo(point1, point2);
        double b = distanceTo(point2, point3);
        double c = distanceTo(point1, point3);
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
