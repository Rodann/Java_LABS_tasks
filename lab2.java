package com.company;

public class lab2 {
    public static void main(String[] args) {
        Point3d a = new Point3d(1,2,3);
        Point3d b = new Point3d(4,5,6);
        Point3d c = new Point3d(7,8,9);
         rav(a,b,c);
    }
    public static double  computeArea(Point3d a,Point3d b,Point3d c){
            double s1 = a.distanceTo(b);
            double s2 = b.distanceTo(c);
            double s3 = c.distanceTo(a);
            double p = (s1+s2+s3)/2;
            return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    }
    public static void rav(Point3d a,Point3d b,Point3d c){
        if ((a.getX() == b.getX() && a.getY() == b.getY() && a.getZ() == b.getZ())
                ||(a.getX() == c.getX() && a.getY() == c.getY() && a.getZ() == c.getZ())
                ||(b.getX() == c.getX() && b.getY() == c.getY() && b.getZ() == c.getZ())){
            System.out.println("Введены одинаковые координаты!");
        }
        else System.out.println(computeArea(a,b,c));

    }
}
