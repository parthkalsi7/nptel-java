package com.week6;
class mythread implements Runnable{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class q6_2 {
    public static void main(String[] args) {
        mythread thr = new mythread();
        Thread t = new Thread(thr);
        t.start();
    }

}
