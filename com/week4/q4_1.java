package com.week4;
import static java.lang.System.*;
import java.util.Scanner;

public class q4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String courseName = sc.nextLine();
        // Can directly access out class due to importing its parent class system
        out.println("Course: " + courseName);
    }
}
