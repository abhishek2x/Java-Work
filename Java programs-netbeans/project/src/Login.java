import java.sql.*;
public class Login 
{
    public static void main(String args[])
    {
        String s="create table Tb1(col1 int, col2 varchar(20))";
        Connection c=null;
       String url="jdbc:mysql://localhost:3306/college";
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        c=DriverManager.getConnection(url,"root", "blackrider12345");
        System.out.println("connection established");
        Statement stmt=c.createStatement();
        ResultSet re=stmt.executeQuery("select * from student_details");
        while(re.next())
        {
            System.out.println(re.getString(1)+"  "+re.getString(2)+"  "+re.getString(3)+"  "+re.getString(4)); 
        }
        
//        ResultSet r1=stmt.executeQuery("select * from Employees");
//        while(r1.next())
//        {
//            System.out.println(r1.getString(1)+" "+r1.getString(2)+" "+r1.getString(3));
//        }
        System.out.println("sql updated");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Driver not Loaded");
    }
        catch(SQLException e)
        {
            System.out.println("connection not established");
        }
        try{
        c.close();
          }
        catch(SQLException e)
        {
          System.out.println("error");
        }
    }
}


