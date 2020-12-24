// Ever and Odd
import java.io.*;
class Evod
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        int n;
        n = Integer.parseInt(br.readLine());
        if(n%2 == 0)
        System.out.println("even");
        else
        System.out.println ("odd");
    }
}
