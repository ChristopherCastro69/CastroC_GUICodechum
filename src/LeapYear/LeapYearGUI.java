package LeapYear;

import javax.swing.*;

public class LeapYearGUI {
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {

        btnCheckYear.addActionListener((event) -> {

                int year = Integer.parseInt(tfYear.getText());

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            JOptionPane.showMessageDialog(pnlMain, "Leap Year", "Message", 1);
                        } else {
                            JOptionPane.showMessageDialog(pnlMain, "Not Leap Year", "Message", 1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(pnlMain, "Leap Year", "Message", 1);
                    }
                } else {
                    JOptionPane.showMessageDialog(pnlMain, "Not Leap Year", "Message", 1);
                }

        });
    }

    }

