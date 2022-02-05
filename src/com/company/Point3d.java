package com.company;

import static java.lang.Math.sqrt;

// Let user create 3D-point object & get or set its coordinates
// & calculate distance between two objects (3D-points) & calculate the area of a triangle
public class Point3d {
    private static double xCoordinate;
    private static double yCoordinate;
    private static double zCoordinate;

    // Defines 3D-point's model with coordinates
    public Point3d(double xCoordinate, double yCoordinate, double zCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    // Defines 3D-point's model without coordinates (default set to 0)
    public Point3d(){
        this(0.0,0.0,0.0);
    }

    // Get the current coordinate of the current 3D-point
    public double getX(){
        return xCoordinate;
    }
    public double getY(){
        return yCoordinate;
    }
    public double getZ(){
        return zCoordinate;
    }

    // Set the current coordinate of the current 3D-point
    public void setX(double xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public void setY(double yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    public void setZ(double zCoordinate){
        this.zCoordinate = zCoordinate;
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
        double p = (a+b+c)/2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}