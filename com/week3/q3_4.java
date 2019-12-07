package com.week3;
import java.util.Scanner;
class operations{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    static void multiply(int a,int b)
    {
        System.out.println(a*b);
    }
}
public class q3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        operations obj = new operations();
        obj.sum(l,b);
        obj.multiply(l,b);
    }
}
