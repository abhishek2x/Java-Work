// Calculate average of marks of n number of stdents
import java.io.*;
class Avg
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER : ");
        int n;
        int sum = 0;
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS IN ARRAY\n");
        for (int i = 0; i < n; i++) 
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        System.out.println("AVERAGE  = " + (sum/n));
    }
}
