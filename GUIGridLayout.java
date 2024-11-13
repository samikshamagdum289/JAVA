import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIGridLayout extends JFrame implements ActionListener {
    boolean flag = true;
    JButton b[] = new JButton[6]; // Initialize JButton array

    public GUIGridLayout() {
        String Labels[] = { "1", "2", "3", "4", "5", "6" };
        setLayout(new GridLayout(2, 3));
        for (int i = 0; i < Labels.length; i++) {
            b[i] = new JButton(); // Initialize each JButton
            b[i].setText(Labels[i]);
            b[i].addActionListener(this);
            add(b[i]);
        }
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (flag)
            setLayout(new GridLayout(3, 2));
        else
            setLayout(new GridLayout(2, 3));
        flag = !flag;
        validate();
    }

    public static void main(String[] args) {
        new GUIGridLayout();
    }
}
