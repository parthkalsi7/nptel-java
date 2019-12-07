package com.week1;
import javax.xml.transform.Source;
import java.util.* ;
public class q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double radius = obj.nextDouble();
        if(radius<=0)
        {
            System.out.println("Please enter non zero positive number");
        }
        else
        {
            System.out.println(2*Math.PI*radius);
            System.out.println(Math.PI*radius*radius);
        }
    }
}
