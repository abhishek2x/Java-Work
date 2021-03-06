import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class Notepad 
{
        public static void main(String args[]) 
        {
            MenuExample obj = new MenuExample();
        }
}

class MenuExample extends JFrame implements ActionListener 
{

    JMenu File, Edit, Help, Back;

    JMenuItem cut, copy, paste, select_all, about, open, save, neww, close, mm;

    JTextArea ta;

    final JFileChooser fc = new JFileChooser();

    MenuExample() 
    {
        JMenuBar mb = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Help = new JMenu("Help");
        Back = new JMenu("Back");
        cut = new JMenuItem("Cut");
        mm = new JMenuItem("Main Menu");
        copy = new JMenuItem("Copy");
        open = new JMenuItem("Open");
        neww = new JMenuItem("New");
        close = new JMenuItem("Close");
        save = new JMenuItem("Save");
        paste = new JMenuItem("Paste");
        about = new JMenuItem("About Notepad");
        
        select_all = new JMenuItem("Select all");

        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);

        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        Edit.add(select_all);
        Help.add(about);
        File.add(neww);
        File.add(open);
        File.add(save);
        File.add(close);
        Back.add(mm);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        select_all.addActionListener(this);
        about.addActionListener(this);
        neww.addActionListener(this);
        save.addActionListener(this);
        open.addActionListener(this);
        close.addActionListener(this);
        mm.addActionListener(this);


        mb.add(File);
        mb.add(Edit);
        mb.add(Help);
        mb.add(Back);
        setJMenuBar(mb);

        add(ta);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == select_all)
            ta.selectAll();
        if(e.getSource() == about)
            JOptionPane.showMessageDialog(MenuExample.this,"\" This Notepad is developed by Abhishek using Java. \"");

        if (e.getSource() == open) 
         {
			JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(this); 
            
			// if the user clicked OK, we have "APPROVE_OPTION"
            if (option == JFileChooser.APPROVE_OPTION) 
            {
				this.ta.setText(""); // clear the TextArea
                try 
                {
					Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
					while (scan.hasNext())  //reading file
						this.ta.append(scan.nextLine() + "\n");
                } 
                catch (Exception ex) 
                { 
					System.out.println(ex.getMessage());
				}
			}
		}
        if (e.getSource() == neww) 
        {
            ta.setText("");
        }
        if (e.getSource() == save) 
        {
            JFileChooser save = new JFileChooser();
			int option = save.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) 
            {
                try 
                {
					BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
					out.write(this.ta.getText()); // write the contents of the TextArea to the file
					out.close();
                } 
                catch (Exception ex) 
                {
					System.out.println(ex.getMessage());
				}
			}
		}
        if (e.getSource() == close) 
            this.dispose();
        if (e.getSource() == mm)
        {
            fc.this.setVisible(false);
            f frame2 = new f();
        } 
             
    }
}
