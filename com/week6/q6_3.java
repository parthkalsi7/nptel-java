package com.week6;
interface parent{
    public abstract void run();
}
class inter implements parent{
    public void run()
    {

    }
}
class MyThread extends inter {
       public void run()
       {
           System.out.println("NPTEL Java");
       }
}
public class q6_3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
    }
}
