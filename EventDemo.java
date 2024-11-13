import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame {
    private JCheckBox checkBox;
    private JTextField textField;
    private JLabel statusLabel;

    public EventDemo() {
        // Frame initialization
        super("Event Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Checkbox
        checkBox = new JCheckBox("Enable typing");
        checkBox.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                boolean selected = (e.getStateChange() == ItemEvent.SELECTED);
                textField.setEditable(selected);
                statusLabel.setText("Typing " + (selected ? "enabled" : "disabled"));
            }
        });

        // Text field
        textField = new JTextField(15);
        textField.setEditable(false); // initially disabled
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                statusLabel.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                statusLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        // Status label
        statusLabel = new JLabel("Typing disabled");

        // Add components to the frame
        add(checkBox);
        add(textField);
        add(statusLabel);

        // Set visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the program
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDemo();
            }
        });
    }
}
