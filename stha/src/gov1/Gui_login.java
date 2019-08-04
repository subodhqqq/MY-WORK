/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov1;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;


/**
 *
 * @author subodh
 */
public class Gui_login implements ActionListener {

    JFrame frame;
    JLabel lb_id, lb_pass,lb_message;
    JTextField tx_id,tx_password;
    JButton btn_login, btn_close;
   // JPasswordField jpass;
   

    public Gui_login() {
//JFrame initialization
        frame = new JFrame("       Salary         ");
      
        frame.setTitle("Personal info");
        frame.setLayout(new FlowLayout());
        frame.setSize(450, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.setTitle("Test Window");
        //JLabel initialization
        lb_id = new JLabel("id: ");
        lb_pass = new JLabel("Password: ");

        tx_id = new JTextField(16);
           tx_password= new JTextField(16);

      /*  jpass = new JPasswordField("");
        jpass.setColumns(10);
        jpass.setEchoChar('*');*/

        btn_login = new JButton();
        btn_login.setText("log in");
        btn_login.addActionListener(this);

        btn_close = new JButton();
        btn_close.setText("close");
        btn_close.addActionListener(this);

      lb_message= new JLabel("message ");
      
      
        frame.add(lb_id);
        frame.add(tx_id);
        frame.add(lb_pass);
        frame.add(tx_password);
        frame.add(btn_login);
        frame.add(btn_close);
        frame.add(lb_message);
  
        // adding it to JScrollPane 
   
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource().equals(btn_close)) {
            System.exit(0);
        }
      else if (ae.getSource().equals (btn_login)) {
          
             lb_message.setText("LOGIN.........");
             String tmp_name=tx_id.getText();
               String tmp_password=tx_password.getText();
             Login login=new Login(tmp_name,tmp_password);
             
          DB_login db_login=new DB_login();
          Login_info login_result=db_login.login(login);
          lb_message.setText(login_result.message.toString());
        }
    }

    public static void main(String[] arg) {
        new Gui_login();
    }
}
