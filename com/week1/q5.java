package com.week1;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int s = obj.nextInt();
        int[] arr = new int[s] ;
        int i,sum=0,max = 0 ;
        for(i=0;i<arr.length;i++)
        {
            arr[i]= obj.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sum/s);
    }
}
