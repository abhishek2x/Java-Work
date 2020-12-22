import java.io.*;
class Arrays
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER SIZE OF 2D ARRAY");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
int i,j;
int arr[][]=new int[m][n];
int a,t;
System.out.println("ENTER ELEMENTS IN THE ARRAY");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("ORIGINAL MATRIX");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
System.out.println("SORTED MATRIX");
 t=0;
 int c=0;
for(i=0;i<m;i++)
{
a=arr[i][0];
for(j=0;j<n-i-1;j++)
{
if(arr[c][j]>arr[c][j+1])
{
t=arr[c][j];
arr[c][j]=arr[c][j+1];
arr[c][j+1]=t;
}
}
c++;
}




for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
}
}








