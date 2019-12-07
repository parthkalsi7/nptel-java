package com.week7;
import java.io.*;
public class q7_2 {
    public static void main(String[] args) {
        try {
            InputStreamReader sc = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(sc);
            String number = br.readLine();
            int x = Integer.parseInt(number);
            System.out.println(x*x);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
