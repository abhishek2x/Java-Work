// Check if a number is an Armstrong number
import java.io.*;
class Arms
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER : ");
        int n;
        n = Integer.parseInt(br.readLine());
        int dig = 0;
        int a, m, o, b = 0;
        m = o = n;
        while(o != 0)
        {
            dig++;
            o = o/10;
        }
        while(n != 0)
        {
            a = n % 10;
            b = b + (int)Math.pow(a, dig);
            n = n/10;
        }
        if(m == b)
        System.out.println("ARMSTRONG NUMBER ");
        else 
        System.out.println("NOT A ARMSTRONG NUMBER ");
    }
}
