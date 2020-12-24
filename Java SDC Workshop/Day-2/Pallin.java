// Check if a number is a Pallindrone number or not
import java.io.*;
class Pallin
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER : ");
        int n;
        n = Integer.parseInt(br.readLine());
        int a, m, b = 0;
        m = n;
        while(n != 0)
        {
            a = n % 10;
            b = (b*10) + a;
            n = n/10;
        }
        if(m == b)
        System.out.println("PALLINDROME NUMBER ");
        else 
        System.out.println("NOT A PALLINDROME NUMBER ");
    }
}
