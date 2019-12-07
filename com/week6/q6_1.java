package com.week6;

public class q6_1 extends Thread {
    public void run()
    {
        System.out.println("Thread q6_1 is running");
    }
    public static void main(String[] args) {
        //to start a thread just create an object of the class that;s implementing
        //it and using tht object call start() function
        q6_1 obj = new q6_1();
        obj.start();
    }
}
