import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NewClass 
{
        public static void main(String[] args) 
        {
            S2 obj = new S2(); // creating an object of the class
        }
}

class S2 extends JFrame implements ActionListener 
{

    private JButton b;
    private JButton b1;
    private JLabel txt1;
    private JLabel txt2;

    //constructor is automatically called on object creation
    S2() 
    {
        b = new JButton("Click Here to display name of university: ");
        txt1 = new JLabel(" ");
        txt2 = new JLabel(" ");
        add(b);
        add(txt1);
        b.addActionListener(this); //adding Action Listener to 'Button b'
        
        b1 = new JButton("Click to get started: ");
        add(b1);
        add(txt2);
        b1.addActionListener(this); 

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) 
    {
        //this method is called when an Event occurs
        if(e.getSource()==b)
        {        
            txt1.setText("VIT");
        }
        if(e.getSource()==b1)
        {
        txt2.setText("SORRY!...YOU ARE HACKED!");
        }
    }
}
