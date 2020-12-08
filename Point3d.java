package com.company;

public class Point3d extends Point2d {
    private double zCoord;
    public Point3d ( double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public double getZ () {
        return zCoord;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
    public double distanceTo(Point3d a){
        double x1 = a.getX();
        double y1 = a.getY();
        double z1 = a.getZ();
        return Math.pow((Math.pow(x1-getX(),2)+Math.pow(y1-getY(),2)+Math.pow(z1-getZ(),2)),1/2);
    }
}

