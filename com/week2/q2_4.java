package com.week2;
public class q2_4 {
    int a ;
    q2_4()
    {
        System.out.println("Default Constructor");
    }
    q2_4(int b)
    {
        this();
        System.out.println(this.a=b);
    }
    public static void main(String[] args) {
        q2_4 obj = new q2_4(10);
    }
}
