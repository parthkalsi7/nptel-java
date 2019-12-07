package com.week8;
import java.util.Scanner;
public class q8_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Height of Pyramid : ");
        int height = obj.nextInt();
        int rows,spaces,stars,no_of_stars=0;
        for(rows=1;rows<=height;rows++)
        {
            for(spaces=1;spaces<=height-rows;spaces++)
            {
                System.out.print(" ");
            }
            for(stars=1;stars<=2*rows-1;stars++)
            {
                System.out.print("*");
                no_of_stars++;
            }
            System.out.println();
        }
        System.out.println("Number of Stars Printed :"+no_of_stars);
    }
}
