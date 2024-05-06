package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    protected JFrame frame;

    public void prepareGUI() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 480);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
