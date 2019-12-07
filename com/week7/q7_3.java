package com.week7;
import java.util.*;
public class q7_3 {
    public static void main(String[] args) {
        try {
            byte[] array = {'P', 'a', 'r', 't', 'h'};
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(array[n]);
            System.out.print((char) array[n]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
