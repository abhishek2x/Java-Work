import java.util.*;
class Frequency
{
static void main()
{
Scanner obj=new Scanner(System.in);
String s,s1="";
int c=0;
System.out.println("Enter string");
s=obj.nextLine();
s=s+" ";
for(int i=0;i<s.length();++i)
{
if(s.charAt(i)==' ')
++c;
}
String a[]=new String[c];
int g=0;
for(int v=0;v<s.length();++v)
{
if(s.charAt(v)==' ')
{
a[g]=s1;
++g;
s1="";
}
else s1=s1+s.charAt(v);
}

for(int j=0;j<c;++j)
{
int y=0;
if(a[j]!=""){
for( int k=0;k<c;++k)
{


if(a[j].compareTo(a[k])==0)
{
if(j!=k)

a[k]="";
y=y+1;
}
}
System.out.println("Frequency of "+a[j]+" is"+y);
}
}
}}

