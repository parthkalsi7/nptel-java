package com.week4;
interface extralarge{
    static String extra = "Extra Large" ;
    void display();
    class large{
        void print()
        {
            System.out.println("Large");
        }
    }
    class medium extends large
    {
        void print()
        {
            super.print();
            System.out.println("Medium");
        }
    }
    class small extends medium
    {
        void print()
        {
            super.print();
            System.out.println("Small");
        }
    }
}
    public class q4_3 implements extralarge {
        public static void main(String[] args) {
            small s = new small();
            s.print();
            q4_3 e = new q4_3();
            e.display();

        }
        public void display()
        {
            System.out.println("Extra Large");
        }
}
