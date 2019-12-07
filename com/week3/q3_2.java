package com.week3;
import java.util.Scanner;
class point
{
    double x,y ;
    public point(double a,double b)
    {
        this.x = a ;
        this.y = b ;
    }

    public point() {

    }

    void distance(point p1,point p2)
    {
        double dis = Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
        System.out.println(dis);
    }
}
public class q3_2 {
    public static void main(String[] args) {
        double x1,x2,y1,y2 ;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        point a1 = new point(x1,y1);
        point a2 = new point(x2,y2);
        point p3 = new point();
        p3.distance(a1,a2);

    }
}
