package Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DesignCalculator extends CalculatorGUI implements ActionListener {
    private JLabel label = new JLabel();
    private JTextField textField = new JTextField();

    double num1, num2, result;
    int calculation;
    int pluscount, minuscount, mulcount, divcount;

    JButton zeroButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton equalButton = new JButton("=");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton multiplyButton = new JButton("x");
    JButton divButton = new JButton("/");
    JButton reminderButton = new JButton("%");
    JButton delButton = new JButton("D");
    JButton clrButton = new JButton("C");
    JButton invButton = new JButton("x\u207B");
    JButton sqrButton = new JButton("x\u00B2");
    JButton rootButton = new JButton("\u221A");
    JButton pointButton = new JButton(".");

    JRadioButton buttonon = new JRadioButton("ON");
    JRadioButton buttonoff = new JRadioButton("OFF");

    void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        frame.add(label);

        textField.setPreferredSize(new Dimension(270, 40));
        textField.setBounds(10, 40, 270, 60);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        buttonon.setBounds(10, 115, 60, 40);
        buttonon.setSelected(true);
        buttonon.setFont(new Font("Arial", Font.BOLD, 14));
        buttonon.setBackground(Color.BLACK);
        buttonon.setForeground(Color.WHITE);
        buttonon.setFocusable(false);
        frame.add(buttonon);

        buttonoff.setBounds(10, 140, 60, 40);
        buttonoff.setSelected(false);
        buttonoff.setFont(new Font("Arial", Font.BOLD, 14));
        buttonoff.setBackground(Color.BLACK);
        buttonoff.setForeground(Color.WHITE);
        buttonoff.setFocusable(false);
        frame.add(buttonoff);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonon);
        buttonGroup.add(buttonoff);

        divButton.setBounds(220, 130, 60, 40);
        divButton.setFont(new Font("Arial", Font.BOLD, 20));
        divButton.setFocusable(false);
        frame.add(divButton);

        delButton.setBounds(150, 130, 60, 40);
        delButton.setFont(new Font("Arial", Font.BOLD, 20));
        delButton.setFocusable(false);
        frame.add(delButton);

        clrButton.setBounds(80, 130, 60, 40);
        clrButton.setFont(new Font("Arial", Font.BOLD, 20));
        clrButton.setFocusable(false);
        frame.add(clrButton);

        rootButton.setBounds(10, 180, 60, 40);
        rootButton.setFont(new Font("Arial", Font.BOLD, 20));
        rootButton.setFocusable(false);
        frame.add(rootButton);

        sqrButton.setBounds(80, 180, 60, 40);
        sqrButton.setFont(new Font("Arial", Font.BOLD, 20));
        sqrButton.setFocusable(false);
        frame.add(sqrButton);

        invButton.setBounds(150, 180, 60, 40);
        invButton.setFont(new Font("Arial", Font.BOLD, 20));
        invButton.setFocusable(false);
        frame.add(invButton);

        multiplyButton.setBounds(220, 180, 60, 40);
        multiplyButton.setFont(new Font("Arial", Font.BOLD, 20));
        multiplyButton.setFocusable(false);
        frame.add(multiplyButton);

        sevenButton.setBounds(10, 230, 60, 40);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 20));
        sevenButton.setFocusable(false);
        frame.add(sevenButton);

        eightButton.setBounds(80, 230, 60, 40);
        eightButton.setFont(new Font("Arial", Font.BOLD, 20));
        eightButton.setFocusable(false);
        frame.add(eightButton);

        nineButton.setBounds(150, 230, 60, 40);
        nineButton.setFont(new Font("Arial", Font.BOLD, 20));
        nineButton.setFocusable(false);
        frame.add(nineButton);

        fourButton.setBounds(10, 280, 60, 40);
        fourButton.setFont(new Font("Arial", Font.BOLD, 20));
        fourButton.setFocusable(false);
        frame.add(fourButton);

        fiveButton.setBounds(80, 280, 60, 40);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 20));
        fiveButton.setFocusable(false);
        frame.add(fiveButton);

        sixButton.setBounds(150, 280, 60, 40);
        sixButton.setFont(new Font("Arial", Font.BOLD, 20));
        sixButton.setFocusable(false);
        frame.add(sixButton);

        oneButton.setBounds(10, 330, 60, 40);
        oneButton.setFont(new Font("Arial", Font.BOLD, 20));
        oneButton.setFocusable(false);
        frame.add(oneButton);

        twoButton.setBounds(80, 330, 60, 40);
        twoButton.setFont(new Font("Arial", Font.BOLD, 20));
        twoButton.setFocusable(false);
        frame.add(twoButton);

        threeButton.setBounds(150, 330, 60, 40);
        threeButton.setFont(new Font("Arial", Font.BOLD, 20));
        threeButton.setFocusable(false);
        frame.add(threeButton);

        zeroButton.setBounds(10, 380, 130, 40);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
        zeroButton.setFocusable(false);
        frame.add(zeroButton);

        pointButton.setBounds(150, 380, 60, 40);
        pointButton.setFont(new Font("Arial", Font.BOLD, 20));
        pointButton.setFocusable(false);
        frame.add(pointButton);

        equalButton.setBounds(220, 330, 60, 90);
        equalButton.setFont(new Font("Arial", Font.BOLD, 20));
        equalButton.setFocusable(false);
        frame.add(equalButton);

        plusButton.setBounds(220, 280, 60, 40);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));
        plusButton.setFocusable(false);
        frame.add(plusButton);

        minusButton.setBounds(220, 230, 60, 40);
        minusButton.setFont(new Font("Arial", Font.BOLD, 20));
        minusButton.setFocusable(false);
        frame.add(minusButton);

    }

    public void addActionevents() {
        buttonon.addActionListener(this);
        buttonoff.addActionListener(this);
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        equalButton.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divButton.addActionListener(this);
        reminderButton.addActionListener(this);
        delButton.addActionListener(this);
        clrButton.addActionListener(this);
        invButton.addActionListener(this);
        sqrButton.addActionListener(this);
        rootButton.addActionListener(this);
        pointButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == buttonon) {
            enable();
        } else if (source == buttonoff) {
            disable();
        } else if (source == clrButton) {
            label.setText("");
            textField.setText("");
            result=0;
            num1=0;
            num2=0;
        } else if (source == delButton) {
            int l = textField.getText().length();
            if (l > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(l - 1);
                textField.setText(back.toString());
            }
            label.setText("");
        } else if (source == zeroButton) {
            if (textField.getText().equals("0"))
                return;
            else
                textField.setText(textField.getText() + "0");
        } else if (source == oneButton)
            textField.setText(textField.getText() + "1");
        else if (source == twoButton)
            textField.setText(textField.getText() + "2");
        else if (source == threeButton)
            textField.setText(textField.getText() + "3");
        else if (source == fourButton)
            textField.setText(textField.getText() + "4");
        else if (source == fiveButton)
            textField.setText(textField.getText() + "5");
        else if (source == sixButton)
            textField.setText(textField.getText() + "6");
        else if (source == sevenButton)
            textField.setText(textField.getText() + "7");
        else if (source == eightButton)
            textField.setText(textField.getText() + "8");
        else if (source == nineButton)
            textField.setText(textField.getText() + "9");
        else if (source == pointButton) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == plusButton ) {
            if(minuscount>0 ||mulcount>0 ||divcount>0 ){
             if(minuscount>0 ||mulcount>0 ||divcount>0 ){
                pluscount=0;
                minuscount=0;
                mulcount=0;
                divcount=0;
                num2 = Double.parseDouble(textField.getText());
                if (calculation == 1) {
                    result = num1 + num2;
                } else if (calculation == 2) {
                    result = num1 - num2;
                } else if (calculation == 3) {
                    result = num1 * num2;
                } else if (calculation == 4) {
                    result = num1 / num2;
                }
    
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                label.setText("");
    
                num1 = result;
            }
           
            pluscount++;
            if (pluscount > 1) {
                num2 = Double.parseDouble(textField.getText());
                result = num1 + num2;
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                String str = textField.getText();
                label.setText("");
                num1 = result;
                textField.setText("");
                label.setText(str+ "+");
            }
            }
           
            pluscount++;
            if (pluscount > 1) {
                num2 = Double.parseDouble(textField.getText());
                result = num1 + num2;
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                String str = textField.getText();
                label.setText("");
                num1 = result;
                textField.setText("");
                label.setText(str+ "+");
            }
            else{
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
            }

        } else if (source == minusButton) {

             if(pluscount>0 ||mulcount>0 ||divcount>0 ){
                pluscount=0;
                minuscount=0;
                mulcount=0;
                divcount=0;
                num2 = Double.parseDouble(textField.getText());
                if (calculation == 1) {
                    result = num1 + num2;
                } else if (calculation == 2) {
                    result = num1 - num2;
                } else if (calculation == 3) {
                    result = num1 * num2;
                } else if (calculation == 4) {
                    result = num1 / num2;
                }
    
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                label.setText("");
    
                num1 = result;
            }
           
            
            minuscount++;
            if (minuscount > 1) {
                num2 = Double.parseDouble(textField.getText());
                result = num1 - num2;
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                String str = textField.getText();
                label.setText("");
                num1 = result;
                textField.setText("");
                label.setText(str+ "-");
            }
            else{
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
            }
        } else if (source == multiplyButton) {
           if(pluscount>0 ||minuscount>0 ||divcount>0 ){
                pluscount=0;
                minuscount=0;
                mulcount=0;
                divcount=0;
                num2 = Double.parseDouble(textField.getText());
                if (calculation == 1) {
                    result = num1 + num2;
                } else if (calculation == 2) {
                    result = num1 - num2;
                } else if (calculation == 3) {
                    result = num1 * num2;
                } else if (calculation == 4) {
                    result = num1 / num2;
                }
    
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                label.setText("");
    
                num1 = result;
            }
            mulcount++;
            if (mulcount > 1) {
                num2 = Double.parseDouble(textField.getText());
                result = num1 * num2;
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                String str = textField.getText();
                label.setText("");
                num1 = result;
                textField.setText("");
                label.setText(str+ "*");
            }
            else{
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "*");
            }
        } else if (source == divButton) {
            if(pluscount>0 ||mulcount>0 ||minuscount>0 ){
                pluscount=0;
                minuscount=0;
                mulcount=0;
                divcount=0;
                num2 = Double.parseDouble(textField.getText());
                if (calculation == 1) {
                    result = num1 + num2;
                } else if (calculation == 2) {
                    result = num1 - num2;
                } else if (calculation == 3) {
                    result = num1 * num2;
                } else if (calculation == 4) {
                    result = num1 / num2;
                }
    
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                label.setText("");
    
                num1 = result;
            }
            divcount++;
            if (divcount > 1) {
                num2 = Double.parseDouble(textField.getText());
                result = num1 / num2;
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                String str = textField.getText();
                label.setText("");
                num1 = result;
                textField.setText("");
                label.setText(str+ "/");
            }
            else{
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
            }
        } else if (source == sqrButton) {
            num1 = Double.parseDouble(textField.getText());
            double squre = Math.pow(num1, 2);
            String str = Double.toString(squre);
            if (str.endsWith(".0")) {
                textField.setText(str.replace(".0", ""));
            } else {
                textField.setText(str);
            }
        } else if (source == rootButton) {
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        } else if (source == invButton) {
            num1 = Double.parseDouble(textField.getText());
            double inv = 1 / num1;
            String str = Double.toString(inv);
            if (str.endsWith(".0")) {
                textField.setText(str.replace(".0", ""));
            } else {
                textField.setText(str);
            }
        } else if (source == equalButton) {
            pluscount=0;
            minuscount=0;
            mulcount=0;
            divcount=0;
            num2 = Double.parseDouble(textField.getText());
            if (calculation == 1) {
                result = num1 + num2;
            } else if (calculation == 2) {
                result = num1 - num2;
            } else if (calculation == 3) {
                result = num1 * num2;
            } else if (calculation == 4) {
                result = num1 / num2;
            }

            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");

            num1 = result;

        }
    }

    public void enable() {
        buttonon.setEnabled(false);
        buttonoff.setEnabled(true);
        label.setText("");
        textField.setText("");
        zeroButton.setEnabled(true);
        oneButton.setEnabled(true);
        twoButton.setEnabled(true);
        threeButton.setEnabled(true);
        fourButton.setEnabled(true);
        fiveButton.setEnabled(true);
        sixButton.setEnabled(true);
        sevenButton.setEnabled(true);
        eightButton.setEnabled(true);
        nineButton.setEnabled(true);
        equalButton.setEnabled(true);
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        multiplyButton.setEnabled(true);
        divButton.setEnabled(true);
        reminderButton.setEnabled(true);
        delButton.setEnabled(true);
        clrButton.setEnabled(true);
        invButton.setEnabled(true);
        sqrButton.setEnabled(true);
        rootButton.setEnabled(true);
        pointButton.setEnabled(true);
        result=0;
    }

    public void disable() {

        buttonon.setEnabled(true);
        buttonoff.setEnabled(false);
        label.setText("");
        textField.setText("");
        zeroButton.setEnabled(false);
        oneButton.setEnabled(false);
        twoButton.setEnabled(false);
        threeButton.setEnabled(false);
        fourButton.setEnabled(false);
        fiveButton.setEnabled(false);
        sixButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);
        equalButton.setEnabled(false);
        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        divButton.setEnabled(false);
        reminderButton.setEnabled(false);
        delButton.setEnabled(false);
        clrButton.setEnabled(false);
        invButton.setEnabled(false);
        sqrButton.setEnabled(false);
        rootButton.setEnabled(false);
        pointButton.setEnabled(false);
        result =0;

    }
}