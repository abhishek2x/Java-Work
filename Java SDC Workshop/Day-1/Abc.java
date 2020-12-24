// Adding
import java.io.*;
class Abc
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        int n;
        n = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int n1;
        n1 = Integer.parseInt(br.readLine());
        int sum = n1 + n;
        System.out.println("Sum = " + sum);
    }
}
