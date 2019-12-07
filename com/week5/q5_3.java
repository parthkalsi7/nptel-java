package com.week5;
import java.util.Scanner;
public class q5_3 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Dividing by Zero in a/b b can't be zero");
        }
        }
}
