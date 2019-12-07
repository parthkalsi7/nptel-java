package com.week1;
import java.util.Scanner ;
public class q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n] ;
        int i=0,sum = 0 ;
        for(i=0;i<n*2;i=i+2)
        {
            if(i%3==0)
            {
                sum = sum + i ;
            }
        }
        System.out.println("The Even Number Divisible by 3 : "+ sum);
    }
}
