package com.week5;
import java.util.*;
public class q5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        try{
            int sum=0;
            for(int i=0;i<length;i++)
            {
                arr[i]=sc.nextInt();
                sum += arr[i];
            }
            System.out.println(sum);
        }
        catch(InputMismatchException e){
            System.out.println("Enter Valid Input");
        }
    }
}
