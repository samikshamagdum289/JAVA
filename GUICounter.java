import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICounter extends JFrame
 {
    private int count = 0;  
    private JLabel l1 = new JLabel("Count :");
    private JTextField countLabel = new JTextField(25);
    private JButton upButton = new JButton("Count Up");
    private JButton downButton = new JButton("Count Down");
    private JButton resetButton = new JButton("Reset");

    public GUICounter() {
        // Frame initialization
        super("Counter");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // Add components
        add(l1);
        add(countLabel);
        add(upButton);
        add(downButton);
        add(resetButton);

        // Event handling
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                updateLabel();
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                updateLabel();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = 0;
                updateLabel();
            }
        });

        // Set visibility
        setVisible(true);
    }

    private void updateLabel() {
        countLabel.setText(" " + count);
    }

    public static void main(String[] args) {
        // Run the program
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUICounter();
            }
        });
    }
}
