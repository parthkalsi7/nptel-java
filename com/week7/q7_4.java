package com.week7;
import java.io.*;
public class q7_4 {
    public static void main(String[] args) {
        try {
            InputStreamReader obj = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(obj);
            String s = br.readLine();
            int count=0;
            for (int i = 0; i < s.length(); i++) {
                char let=s.charAt(i);
                if(let=='a'||let=='e'||let=='i'||let=='o'||let=='u')
                {count++;}
            }
            System.out.println(count);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
