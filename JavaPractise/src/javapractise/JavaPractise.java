package javapractise;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaPractise implements ActionListener {
    //Declare necessary variables

    JFrame frame;
    JLabel label_num1, label_num2, label_result;
    JTextField txtField_num1, txtField_num2, txtField_result;
    JButton btn_sum, btn_close;

    public JavaPractise() {
        //JFrame initialization
        frame = new JFrame("Test Window");
//        frame.setTitle("Test Window");

        //JLabel initialization
        label_num1 = new JLabel("Num1: ");
//        label_num1.setText("Num1: ");
        label_num2 = new JLabel("Num2: ");

        label_result = new JLabel("Result: ");

        //JTextField initialization
        txtField_num1 = new JTextField(8);
//        txtField_num1.setColumns(8);
        txtField_num2 = new JTextField(8);
        txtField_result = new JTextField(8);

        //JButton initialization
        btn_sum = new JButton("SUM");
        btn_sum.addActionListener(this);
//        btn_sum.setText("SUM");
        btn_close = new JButton("CLOSE");
        btn_close.addActionListener(this);

        //Final setup for JFrame
        frame.setSize(1280, 720);
        frame.add(label_num1);
        frame.add(txtField_num1);
        frame.add(label_num2);
        frame.add(txtField_num2);
        frame.add(label_result);
        frame.add(txtField_result);
        frame.add(btn_sum);
        frame.add(btn_close);

        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn_sum)) {
            double num1 = 0.0;
            double num2 = 0.0;
            double sum;

            try {
                num1 = Double.parseDouble(txtField_num1.getText());
                num2 = Double.parseDouble(txtField_num2.getText());
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers only!!");
            }

            sum = num1 + num2;
            txtField_result.setText(Double.toString(sum));
        } else if (ae.getSource().equals(btn_close)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new JavaPractise();
    }
}
