package com.week4;
interface first{
    default void show()
    {
        System.out.println("Default 1st");
    }
}
interface second{
    default void show()
    {
        System.out.println("Default 2nd");
    }
}
public class q4_4 implements first,second{
    public void show()
    {
        first.super.show();
        second.super.show();
    }
    public static void main(String[] args) {
        q4_4 obj = new q4_4();
        obj.show();
    }
}
