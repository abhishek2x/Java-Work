import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Swing5 implements ActionListener
{
    JFrame j1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b;
    Swing5()
    {
        j1=new JFrame("Sample Frame");
        l1=new JLabel("personId");
        l1.setBounds(50,100,100,30);
        l2=new JLabel("orderId");
        l2.setBounds(50,150,100,30);
        l3=new JLabel("orderNumber");
        l3.setBounds(50,200,100,30);
        
        t1=new JTextField();
        t1.setBounds(150,100,150,20);
        t2=new JTextField();
        t2.setBounds(150,150,150,20);
        t3=new JTextField();
        t3.setBounds(150,200,150,20);
        
        b=new JButton("click");
        b.setBounds(50,300,100,100);
        b.addActionListener(this);
        j1.add(l1);
        j1.add(l2);
        j1.add(l3);
        j1.add(t1);
        j1.add(t2);
        j1.add(t3); 
        j1.add(b);
        j1.setSize(400,400);
        j1.setLayout(null);
        j1.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            String p=t1.getText();
            String o=t2.getText();
            String on=t3.getText();
            System.out.println(p+" "+o+" "+on);
            Connection c=null;
            String url="jdbc:mysql://localhost:3306/college";
            try
            {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            c=DriverManager.getConnection(url,"root", "blackrider12345");
            System.out.println("connection established");
            Statement stmt=c.createStatement();
            String sql ="insert into student_details values( '" +p+ "' , '" +o+ "' , '" +on+ "' )";
            stmt.executeUpdate(sql);
	//c.close();
            }
           catch(SQLException e1)
            {
                System.out.println("connection not established"+e1);
            }
           catch(ClassNotFoundException e2)
            {
                System.out.println("Driver not Loaded");
            }
        }
    }
    public static void main(String args[])
    {
        Swing5 ob=new Swing5();
    }
}
