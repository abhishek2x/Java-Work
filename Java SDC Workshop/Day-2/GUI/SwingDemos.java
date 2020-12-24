import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class SwingDemos {
    public static void main(String args[]) 
    { 
        MenuExample obj = new MenuExample();
    }
}

class MenuExample extends JFrame implements ActionListener {

    JMenu menu, submenu;

    JMenuItem cut, copy, paste, i4, i5;

    JTextArea ta;

    MenuExample() {
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub-menu");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        i4 = new JMenuItem("Sub Item 4");
        i5 = new JMenuItem("Sub Item 5");

        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);

        menu.add(cut);
        menu.add(copy);
        menu.add(paste);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);

        mb.add(menu);
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
            {
                remove(menu);
                remove(submenu);
                remove(cut);
                remove(copy);
                remove(paste);
                remove(i4);
                remove(i5);
                remove(ta);
            }
    }
}
