package com.week1;
import java.util.Scanner ;
public class q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("The Largest Number is : "+a);
            }
        }
        else if(b>c)
        {
            System.out.println("The Largest Number is : "+b);
        }
        else {
            System.out.println("The Largest Number is : "+c);
        }
    }
}
