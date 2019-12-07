package com.week3;
import java.util.Scanner ;
public class q3_1 {
    public static void main(String[] args) {
        int a=0,b=1,i,next = 0,n;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        for(i=2;i<n;i++)
        {
            next = a+b;
            a = b ;
            b = next ;
        }
        if(n>2)
        {
            System.out.println(next);
        }
        else if(n==2)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}
