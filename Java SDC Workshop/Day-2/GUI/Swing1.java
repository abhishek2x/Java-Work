import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing1 {
        public static void main(String[] args) {
            S1 obj = new S1(); // creating an object of the class
        }
    }

class S1 extends JFrame {

    //constructor is automatically called on object creation
    static S1() {
        setSize(300,300);
        /* We need to declare a function for changing the layout:
            1.   FlowLayout()
            2.   BorderLayout()
            3.   GridLayout(rows,columns)
        */
        setLayout(new FlowLayout());
        setVisible(true);

        /*
        When we close the application, the code still runs in the background
        so we add a function to prevent this from happening
        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel L1 = new JLabel("Hello World!");
        JLabel L2 = new JLabel("Welcome!");
        JLabel L3 = new JLabel("Oops!!...You are HACKED!");

        add(L1);
        add(L2);
        add(L3);
    }
}

