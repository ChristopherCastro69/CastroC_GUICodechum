package LeapYear;

import javax.swing.*;
//Sorry for the duplicate file sir,
// I did not commit my progress because I was in an island traveling with my tita
// and there was no consistent signal and I did not know how important it was in the grading ;((

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {

        btnCheckYear.addActionListener((event) -> {
            //this is my exception
            try {
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
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(pnlMain, "Input must be a number. PLease try again.");
            }
        });



    }
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap year Checker");
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);


    }

}

