// Java program to create a simple calculator 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener {
   // create a frame
   public static JFrame f;

   public static JTextField l;

   String s0, s1, s2;

   Calculator() {
      s0 = s1 = s2 = "";
   }

   public static void main(String args[]) 
   {
      f = new JFrame("CALCULATOR BY ABHISHEK");

      try {
         // set look and feel
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }

      Calculator c = new Calculator();
      
      l = new JTextField(16);

      l.setEditable(false);

      JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1, bD;

      // create number buttons
      b0 = new JButton("0");
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");

      // decimal button
      bD = new JButton(".");

      // equals button
      beq1 = new JButton("=");

      // create operator buttons
      ba = new JButton("+");
      bs = new JButton("-");
      bd = new JButton("/");
      bm = new JButton("*");
      beq = new JButton("C");

      // create a panel
      JPanel p = new JPanel();
      JPanel p1 = new JPanel();
      JPanel p2 = new JPanel();
      JPanel p3 = new JPanel();
      JPanel p4 = new JPanel();
      JPanel p5 = new JPanel();

      // add action listeners
      bm.addActionListener(c);
      bd.addActionListener(c);
      bs.addActionListener(c);
      ba.addActionListener(c);
      b9.addActionListener(c);
      b8.addActionListener(c);
      b7.addActionListener(c);
      b6.addActionListener(c);
      b5.addActionListener(c);
      b4.addActionListener(c);
      b3.addActionListener(c);
      b2.addActionListener(c);
      b1.addActionListener(c);
      b0.addActionListener(c);
      beq.addActionListener(c);
      beq1.addActionListener(c);
      bD.addActionListener(c);

      // add elements to panel
      p.add(l);
      p1.add(b7);
      p1.add(b8);
      p1.add(b9);
      p1.add(ba);
      p.add(p1);
      p2.add(b4);
      p2.add(b5);
      p2.add(b6);
      p2.add(bs);
      p.add(p2);
      p3.add(b1);
      p3.add(b2);
      p3.add(b3);
      p3.add(bm);
      p.add(p3);
      p4.add(bd);
      p4.add(b0);
      p4.add(bD);
      p4.add(beq1);
      p.add(p4);
      p5.add(beq);
      p.add(p5);
      ;

      // set Background of panel
      p.setBackground(Color.LIGHT_GRAY);

      // add panel to frame
      f.add(p, BorderLayout.CENTER);

      f.setSize(200, 260);
      f.show();

   }

   public void actionPerformed(ActionEvent e) {
      String s = e.getActionCommand();

      // if the value is a number
      if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
         // if operand is present then add to second no
         if (!s1.equals(""))
            s2 = s2 + s;
         else
            s0 = s0 + s;

         // set the value of text
         l.setText(s0 + s1 + s2);
      } else if (s.charAt(0) == 'C') {
         // clear the one letter
         s0 = s1 = s2 = "";

         // set the value of text
         l.setText(s0 + s1 + s2);
      } else if (s.charAt(0) == '=') {

         double te;

         // store the value in 1st
         if (s1.equals("+"))
            te = (Double.parseDouble(s0) + Double.parseDouble(s2));
         else if (s1.equals("-"))
            te = (Double.parseDouble(s0) - Double.parseDouble(s2));
         else if (s1.equals("/"))
            te = (Double.parseDouble(s0) / Double.parseDouble(s2));
         else
            te = (Double.parseDouble(s0) * Double.parseDouble(s2));

         // set the value of text
         l.setText(s0 + s1 + s2 + "=" + te);

         // convert it to string
         s0 = Double.toString(te);

         s1 = s2 = "";
      } else {
         // if there was no operand
         if (s1.equals("") || s2.equals(""))
            s1 = s;
         // else evaluate
         else {
            double te;

            // store the value in 1st
            if (s1.equals("+"))
               te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
               te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
               te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
               te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            // convert it to string
            s0 = Double.toString(te);

            // place the operator
            s1 = s;

            // make the operand blank
            s2 = "";
         }

         // set the value of text
         l.setText(s0 + s1 + s2);
      }
   }
}