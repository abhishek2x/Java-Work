import java.io.*;
class SuperPrime
{
    public static void main()throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER A NUMBER");
         int n=Integer.parseInt(br.readLine());
         int c=2,d=0,t=0,i,f=0,j,g=0;
         while(t!=n)
         { 
              f=0;
              for(i=01;i<=c;i++)
              {
                  if(c%i==0)
                  f++;
              }
              if(f==2)
              {
                 d++;
                 g=0;
                 for(j=01;j<=d;j++) 
                 {
                     if(d%j==0)
                     g++;
                 }
                 if(g==2)
                 {
                    System.out.println(c+" , ");
                    t++;
                 }
              c++;
              }
         }
   }
}