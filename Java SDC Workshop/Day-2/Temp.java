// Conversion of Temperature
import java.io.*;
class Temp
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER TEMPERATURE : ");
        double cel, far;
        cel = Double.parseDouble(br.readLine());
        far = ((cel*9)/5) + 32; 
        System.out.println("FAR - " + far);
    }
}
