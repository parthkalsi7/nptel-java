package com.week8;
import java.util.Scanner;
public class q8_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int rows,i,j,sum=0;
        int height = obj.nextInt();
        for(rows=1;rows<=height;rows++)
        {
            for(i=1;i<=height-rows;i++)
            {
                System.out.print(" ");
            }
            int a=1;
            for(j=0;j<2*rows-1;j++)
            {
                sum=sum+a;
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
