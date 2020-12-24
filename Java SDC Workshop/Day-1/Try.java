import java.util.*;
class Try
{
    static int chPrime(int n)
    {
        int f = 0;
        for (int i = 1; i < n; i++) 
        {
            if(n%i == 0)
            f++;
        }
        if(f==1)
        return 1;
        else 
        return 0;
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num;
        System.out.println("ENTER A NUMBER\n");
        num = obj.nextInt();
        int f;
        f = chPrime(num);
        if(f == 1)
        System.out.println("PRIME NUMBER\n");
        else
        System.out.println("NOT A PRIME NUMBER");
    }
}
