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

public class test implements ActionListener {
    //Declare necessary variables

    JFrame frame;
    JLabel lb0, lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8;
    JTextField tx0, tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8;
    JButton btn_cul, btn_close, btn_save;
    private int id;
    private String name;
    private String address, phone;
    private double salary = 0.0;
    private double tax, bun, san, net;

    public test() {
//JFrame initialization
        frame = new JFrame("       Salary         ");
//        frame.setTitle("Test Window");

        //JLabel initialization
        lb0 = new JLabel("id: ");
        lb1 = new JLabel("Full Name: ");
//        label_num1.setText("Num1: ");
        lb2 = new JLabel("Address: ");
        lb3 = new JLabel("Phone no: ");
        lb4 = new JLabel("Salary : ");
        lb5 = new JLabel("Tax: ");
        lb6 = new JLabel("Bunous: ");
        lb7 = new JLabel("Sanchaya kos: ");
        lb8 = new JLabel("Net Salary: ");
        //JTextField initialization

        tx0 = new JTextField(16);
        tx1 = new JTextField(16);
//        txtField_num1.setColumns(8);
        tx2 = new JTextField(16);
        tx3 = new JTextField(16);
        tx4 = new JTextField(16);
        tx5 = new JTextField(16);
        tx6 = new JTextField(16);
        tx7 = new JTextField(16);
        tx8 = new JTextField(16);

        //JButton initialization
        btn_cul = new JButton("calculate");
        btn_cul.addActionListener(this);
//        btn_sum.setText("SUM");
        btn_close = new JButton("CLOSE");
        btn_close.addActionListener(this);

        btn_save = new JButton("SAVE");
        btn_save.addActionListener(this);

        //Final setup for JFrame
        frame.setSize(1180, 580);
        frame.add(lb0);
        frame.add(tx0);

        frame.add(lb1);
        frame.add(tx1);

        frame.add(lb2);
        frame.add(tx2);

        frame.add(lb3);
        frame.add(tx3);

        frame.add(lb4);
        frame.add(tx4);

        frame.add(btn_cul);
        frame.add(btn_close);
        frame.add(btn_close);

        frame.add(lb5);
        frame.add(tx5);

        frame.add(lb6);
        frame.add(tx6);

        frame.add(lb7);
        frame.add(tx7);

        frame.add(lb8);
        frame.add(tx8);

        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    private void culTax() {
        this.tax = this.salary - (this.salary * (13 / 100));
    }

    private void culBunous() {
        this.bun = this.salary + (this.salary * (5 / 100));
    }

    private void culSanch() {
        this.san = this.salary - (this.salary * (10 / 100));
    }

    private void culNet() {
        this.net = this.salary - this.tax + this.bun - this.san;

    }

    private void processResult() {
        this.culTax();
        this.culBunous();
        this.culSanch();
        this.culNet();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn_cul)) {
            this.id = Integer.parseInt(tx0.getText());
            this.name = tx1.getText();
            this.address = tx2.getText();
            this.phone = tx3.getText();
            this.salary = Double.parseDouble(tx4.getText());
            this.processResult();
            // total=mark1+mark2+mark3+mark4;
            //avg=total/4;
            /*if(this.mark1>=Global.PM && this.mark2>=Global.PM && this.mark3>=Global.PM && this.mark4>=Global.PM)
            this.result = "Pass";
        else
            this.result = "Failed";*/
            tx5.setText(Double.toString(this.tax));
            tx6.setText(Double.toString(this.bun));
            tx7.setText(Double.toString(this.san));
            tx8.setText(Double.toString(this.net));

        }
        if (ae.getSource().equals(btn_save)) {

        }

        if (ae.getSource().equals(btn_close)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new test();
    }

}
