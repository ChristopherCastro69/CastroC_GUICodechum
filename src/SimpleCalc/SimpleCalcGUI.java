package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.pnlMain);
        app.setSize(700, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String op = cbOperations.getSelectedItem().toString();

                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    double result;
                    switch (op) {
                        case "-":
                            result = num1 - num2;
                            lblResult.setText(String.format("%.2f", result));
                            break;
                        case "+":
                            result = num1 + num2;
                            lblResult.setText(String.format("%.2f", result));
                            break;
                        case "*":
                            result = num1 * num2;
                            lblResult.setText(String.format("%.2f", result));
                            break;
                        case "/":
                            result = num1 / num2;
                            lblResult.setText(String.format("%.2f", result));
                            break;
                    }

                }catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(pnlMain, "Input must be a number. PLease try again.");
                }
            }
        });
    }
}

