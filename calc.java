import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame implements ActionListener {

    // Components
    private JTextField display;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, eqlButton, clrButton;
    private JPanel panel;

    // Variables
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    // Constructor
    public calc() {
        setTitle("Standard Calculator");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        display = new JTextField();
        //setBounds(20);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.CENTER);
        display.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        panel.add(display);

        String[] buttonLabels = {
                                  "7", "8", "9", "/",
                                  "4", "5", "6", "*",
                                  "1", "2", "3", "-",
                                  "0", ".", "=", "+"
                                };

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Times New Roman", Font.PLAIN, 20));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            functionButtons[i] = new JButton(buttonLabels[i]);
            functionButtons[i].setFont(new Font("Times New Roman", Font.PLAIN, 30));
            functionButtons[i].addActionListener(this);
            panel.add(functionButtons[i]);
        }

        add(panel);
    }

    // Action performed when a button is clicked
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        char input = command.charAt(0);

        if (Character.isDigit(input) || input == '.') {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        JOptionPane.showMessageDialog(this, "Error: Division by zero");
                    break;
            }
            display.setText(String.valueOf(result));
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = input;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }
}

