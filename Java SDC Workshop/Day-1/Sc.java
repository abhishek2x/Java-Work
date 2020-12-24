// Using Scanner
import java.util.*;
class Sc
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int n;
        n = obj.nextInt();
        System.out.println("Enter second number");
        int n1;
        n1 = obj.nextInt();
        int sum = n1 + n;
        System.out.println("Sum = " + sum);
    }
}
