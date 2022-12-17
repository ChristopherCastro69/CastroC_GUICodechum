package FoodOrdering;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame{
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private List<JCheckBox> menu;

    private List<JRadioButton> discounts;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.pnlMain);
        app.setSize(600, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public FoodOrderGUI() {
        menu = new ArrayList<>();
        discounts = new ArrayList<>();
        menu.add(cFries);
        menu.add(cTea);
        menu.add(cSundae);
        menu.add(cSoftDrinks);
        menu.add(cPizza);
        menu.add(cBurger);

        ButtonGroup group = new ButtonGroup();
        group.add(rbNone);
        group.add(rb5);
        group.add(rb10);
        group.add(rb15);

        discounts.add(rbNone);
        discounts.add(rb5);
        discounts.add(rb10);
        discounts.add(rb15);
    }
}
