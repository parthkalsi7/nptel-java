package com.week4;
interface shapex{
    public String shape = "This is shapex";
    public void display1();
}
interface shapey extends shapex{
    public String shape = "This is shape y";
    public void display2();
}
class shapez implements shapex,shapey{
    public void display1()
    {
        System.out.println(shapex.shape);
    }
    public void display2()
    {
        System.out.println(shapey.shape);
    }
}
public class q4_5 {
    public static void main(String[] args) {
        shapez obj = new shapez();
        obj.display1();
        obj.display2();
    }
}
