package com.week7;
import java.util.Scanner;
public class q7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<3;i++)
        {
            int a = sc.nextInt();
            sum+=a;
        }
        System.out.println(sum);
    }
}
