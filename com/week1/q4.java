package com.week1;
import java.util.Scanner ;
public class q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int sum = 0,temp = a;
        while(a>0)
        {
            int dig = a%10 ;
            a = a/10 ;
            sum += Math.pow(dig,3);
        }
        if(sum == temp)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }

    }
}
