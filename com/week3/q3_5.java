package com.week3;
import java.util.Scanner;
class question{
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt();
    int e2 = sc.nextInt();
}
public class q3_5 {
    public static void swap(question t)
    {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
    public static void main(String[] args) {
        question obj = new question();
        swap(obj);
        System.out.println(obj.e1+" "+obj.e2);
    }
}
