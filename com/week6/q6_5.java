package com.week6;
class thread1 extends Thread{
    public void run()
    {
        System.out.println("Thread is Running");
    }
}
public class q6_5 {
    public static void main(String[] args) {
        thread1 t = new thread1();
        t.run();
        System.out.println("Name of thread : "+t.getName());
        t.setName("NPTEL");
        System.out.println("New Name of thread : "+t.getName());
    }
}
