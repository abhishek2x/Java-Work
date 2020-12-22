import java.util.*;
class MazyProg1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.nextLine();
CaseSwitch obj = new CaseSwitch(s);
obj.switching();
}
}
 