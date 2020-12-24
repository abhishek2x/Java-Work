import java.awt.*;
import java.awt.event.*;

//Setting buttons on the edges

class MyBorder extends Frame implements ActionListener {
	
	Button b1, b2, b3, b4;
	
	MyBorder() {
		
		setSize(300,300);
		setVisible(true);
		setBackground(Color.BLUE);
		b1 = new Button("North");
		b2 = new Button("South");
		b3 = new Button("East");
        b4 = new Button("West");
        
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        
        // Accepting Actions from keyboard
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) {	setBackground(Color.RED);	}
		if(ae.getSource()==b2) {	setBackground(Color.BLUE);	}
		if(ae.getSource()==b3) {	setBackground(Color.GREEN);	}
		if(ae.getSource()==b4) {	setBackground(Color.LIGHT_GRAY);	}
	}
	
	public static void main(String args[]) {
		
		MyBorder b = new MyBorder();
	}
}
