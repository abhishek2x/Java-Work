import java.util.*;
class CircularShift
{
String str,nstr;
int n;
CircularShift()
{
str="";
nstr="";
n=0;
}
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the code");
str=sc.nextLine();
System.out.println("Enter shift");
n=sc.nextInt();
}
void decode()
{
 int l,i,a;
 char ch;
 l=str.length();
 for(i=0;i<l;i++)
 {
  ch=str.charAt(i);
  a=(int)ch;
  a=a+n;
  if(a>90)
  {
  a=a-26;
}
  ch=(char)a;
  nstr=nstr+ch;
}
}
void print()
{
System.out.println(nstr);
}
}
