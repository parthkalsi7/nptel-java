package com.week6;
class methodhas{
    public synchronized void print(int x) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(x*i);
        }
    }
}
class Thread1 extends Thread{
    methodhas t;
    Thread1(methodhas e)
    {
        this.t = e;
    }
    public void run()
    {
        t.print(5);
    }
}
class Thread2 extends Thread{
    methodhas t;
    Thread2(methodhas e)
    {
        this.t = e;
    }
    public void run()
    {
        t.print(100);
    }
}
public class q6_4 {
    public static void main(String[] args) {
        methodhas obj = new methodhas();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
