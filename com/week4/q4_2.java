package com.week4;
import java.util.Calendar;
public class q4_2 {
    public static void main(String[] args) {
        Calendar obj = java.util.Calendar.getInstance();
        int year = obj.get(obj.YEAR);
        int month = obj.get(obj.MONTH);
        System.out.println("Current Year: "+ year);
        System.out.println("Current Month: "+ month);
    }
}
