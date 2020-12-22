class CaseSwitch
{
String str,nstr;
CaseSwitch(String n)
{
str=n;
nstr="";
}
void switching()
{
char ch;
int i,l,asc;
l=str.length();
for(i=0;i<l;i++)
{
ch=str.charAt(i);
asc=(int)ch;
if(asc>=65&&asc<=90)
{
asc=asc+32;
ch=(char)asc;
}
else if(asc>=97&&asc<=122)
{
asc=asc-32;
ch=(char)asc;
}
nstr=nstr+ch;
}
System.out.println(nstr);
}
}