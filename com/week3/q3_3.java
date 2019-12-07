package com.week3;
import java.util.Scanner;
class shape {
    double length;
    double breadth;

    shape(double a, double b) {
        length = a;
        breadth = b;
    }
    shape(double c) {
        length = breadth = c;
    }
    void calculate()
    {
        System.out.println("Shape 1 Volume : "+ length*breadth);
    }
}
class test1 extends shape{
        double height;
        test1(double length,double z)
        {
            super(length);
            height = z;
        }
        test1(double length,double breadth,double z)
        {
            super(length,breadth);
            height = z;
        }
        void calculate()
        {
            System.out.println("The Volume is : "+ length*breadth*height);
        }
    }
public class q3_3 {
    public static void main(String[] args) {
        double l,b,h;
        Scanner sc = new Scanner(System.in);
        l = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        test1 obj = new test1(l,h);
        test1 obj1 = new test1(l,b,h);
        obj.calculate();
        obj1.calculate();
    }
}
