import java.util.*;
class MazyProg3
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number to be decoded");
long n=sc.nextLong();
Decode obj=new Decode();
obj.dec(n);
}
}
