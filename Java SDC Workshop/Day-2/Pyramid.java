import java.io.*;
class Pyramid
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER : ");
        int n;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) 
        {
            for (int k = n; k > i; k--) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
