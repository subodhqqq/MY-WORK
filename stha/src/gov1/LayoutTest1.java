package gov1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutTest1 implements ActionListener {

    JFrame frame;
    JLabel lb_id, lb_name, lb_address;
    JTextField tx_id, tx_name, tx_address;
    JButton but_save, but_close;

    public LayoutTest1() {
        frame = new JFrame("       Salary         ");

        frame.setTitle("Personal info");
        //frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(4,2));//blanck layout
        
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("layout test");
        
        //JLabel initialization

        lb_id = new JLabel("id:           ");

        lb_name = new JLabel("Name:       ");
        

        lb_address = new JLabel("Address: ");
      

        tx_id = new JTextField(16);
       

        tx_name = new JTextField(16);
       
        tx_address = new JTextField(16);
       

        but_save = new JButton();
        but_save.setText("SAVE");
        but_save.addActionListener(this);

        but_close = new JButton();
        but_close.setText("CLOSE");
        but_close.addActionListener(this);
        
               


        frame.add(lb_id);
        frame.add(tx_id);
        frame.add(lb_name);
        frame.add(tx_name);
        frame.add(lb_address);
        frame.add(tx_address);
        frame.add(but_save);
        frame.add(but_close);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(but_close)) {
            System.exit(0);
        }
        if (ae.getSource().equals(but_save)) {
            System.out.println("save");
        }
    }

    public static void main(String[] args) {
        new LayoutTest1();
    }
}
