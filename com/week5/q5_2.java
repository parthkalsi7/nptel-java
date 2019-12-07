import java.util.Scanner;
interface number
{
    public int gcd(int a,int b);
}
class b implements number
{
    public int gcd(int a,int b)
    {
        // need to learn the derivation for this
        if(a<1||b<1)
        {
            return -1;
        }
        else if(b!=0)
        {
            return gcd(b,a%b);
        }
        else
            return a;
    }
}
public class q5_2 {
    public static void main(String[] args) {
        b obj = new b();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = obj.gcd(x,y);
        System.out.println(z);
    }
}
