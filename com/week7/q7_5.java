package com.week7;
import java.util.Scanner;
public class q7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Parth";
        int n = sc.nextInt();
        char a = 'k';
        StringBuilder str = new StringBuilder(s1);
        // StringBuilder is a class which makes String a mutable sequence of characters
        /*we can also achieve this by converting this String into
         a byte array by default string class method get bytes and then
         get the byte for the character to replace*/
        str.setCharAt(n,a);
        System.out.println(str);
    }
}
