import java.awt.*;
import java.awt.event.*;

class Demo1 extends Frame implements ActionListener {
    
    // declaring buttons and text-fields
	Button b1,b2,b3,b4,b5;
	TextField t1;
	
	Demo1()
	{
		setVisible(true);
		setSize(300,300);
		
        // Allocating memory
		b1 = new Button("RED");  
		b2 = new Button("BLUE");
		b3 = new Button("GREEN");
		b4 = new Button("CLOSE");
		b5 = new Button("GRAY");

		t1 = new TextField(20);
		
		setLayout(new FlowLayout());
		// we can display in any order we want. Here it is : b1,b3,b2,b4
		add(b1);
		add(b3);
		add(b2);
		add(b5);
		add(b4);
		add(t1);
        
        // Accepting Actions from keyboard
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b5.addActionListener(this);
        b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) {	setBackground(Color.RED);	}
		if(ae.getSource()==b2) {	setBackground(Color.BLUE);	}
		if(ae.getSource()==b3) {	setBackground(Color.GREEN);	}
		if(ae.getSource()==b5) {	setBackground(Color.LIGHT_GRAY);	}
		if(ae.getSource()==b4) {	dispose();					}
	}
	
	public static void main(String args[])
	{
		Demo1 obj = new Demo1();
	}
}
