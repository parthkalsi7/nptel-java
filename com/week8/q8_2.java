package com.week8;
import java.util.Scanner;
public class q8_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Height of Pascal Pyramid : ");
        int height = obj.nextInt();
        int rows,i,j,no_of_stars=0;
        int spaces=height-1;
        for(rows=1;rows<=height;rows++)
        {
            for(i=1;i<=spaces;i++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=rows;j++)
            {
                System.out.print("* ");
                no_of_stars++;
            }
            System.out.println();
            spaces--;
        }
        System.out.println("Number of Stars Printed :"+no_of_stars);
    }
}
