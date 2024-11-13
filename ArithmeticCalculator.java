import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticCalculator extends JFrame implements ActionListener {
    private JTextField firstNumberField, secondNumberField, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public ArithmeticCalculator() {
        setTitle("Arithmetic Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double firstNumber = Double.parseDouble(firstNumberField.getText());
        double secondNumber = Double.parseDouble(secondNumberField.getText());

        if (e.getSource() == addButton) {
            double result = firstNumber + secondNumber;
            resultField.setText(String.valueOf(result));
        } else if (e.getSource() == subtractButton) {
            double result = firstNumber - secondNumber;
            resultField.setText(String.valueOf(result));
        } else if (e.getSource() == multiplyButton) {
            double result = firstNumber * secondNumber;
            resultField.setText(String.valueOf(result));
        } else if (e.getSource() == divideButton) {
            if (secondNumber != 0) {
                double result = firstNumber / secondNumber;
                resultField.setText(String.valueOf(result));
            } else {
                resultField.setText("Cannot divide by zero");
            }
        }
    }

    public static void main(String[] args) {
        new ArithmeticCalculator();
    }
}
