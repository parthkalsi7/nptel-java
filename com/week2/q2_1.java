package com.week2;
        class school{
        class student{
            void printout()
            {
                System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL.");
                System.out.print("NPTEL");
            }

        }
    }
    public class q2_1{
        public static void main(String[] args) {
            school.student obj = new school().new student();
            obj.printout();
    }
}
