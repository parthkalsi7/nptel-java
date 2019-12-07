package com.week5;
import java.util.Scanner;
interface number
{
    public int findsqr(int i);
}
class a implements number
{
    public int findsqr(int i)
    {
        i*=i;
        return i;
    }
}
public class q5_1 {
    public static void main(String[] args) {
        a obj = new a();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x = obj.findsqr(x);
        System.out.println(x);
    }
}
