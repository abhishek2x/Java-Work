import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class swingDemo {
    public static void main(String[] args) 
    {
        S4 obj = new S4(); // creating an object of the class
    }
}

class S4 extends JFrame 
{

    private JButton b1, b2;
    private JLabel l1, l2;
    private JTextField t1, t2;

    //constructor is automatically called on object creation
    S4() 
    {
        t1 = new JTextField(10);
        l1 = new JLabel("Celsius:");
        b1 = new JButton("Convert to Celsius");
        
        b2 = new JButton("Convert to Fahrenheit");
        t2 = new JTextField(10);
        l2 = new JLabel("Fahrenheit:");
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(l2);
        add(t2);
        b2.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                    Double inC = Double.parseDouble(t1.getText());
                    Double inF = ((inC*1.8) + 32);
                    t2.setText("" + inF);
            }
        }                                   ); //adding Action Listener to 'Button b1'
        b1.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                    Double inF = Double.parseDouble(t2.getText());
                    Double inC = ((inF - 32)/1.8);
                    t1.setText("" + inC);
            }
        }                                   ); //adding Action Listener to 'Button b2'

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}