import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIBorderLayout extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3;

    GUIBorderLayout() {
        setLayout(new BorderLayout());
        l1 = new JLabel("Number");
        l2 = new JLabel("Result");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Factorial");
        b2 = new JButton("square");
        b3 = new JButton("Cube");

        Dimension buttonSize = new Dimension(100, 100);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);

        JPanel jp1 = new JPanel();
        jp1.add(l1);
        jp1.add(t1);
        add(jp1, BorderLayout.NORTH);

        b1.addActionListener(this);
        add(b1, BorderLayout.WEST);
        add(b2, BorderLayout.CENTER);
        add(b3, BorderLayout.EAST);

        JPanel jp2 = new JPanel();
        jp2.add(l2);
        jp2.add(t2);
        add(jp2, BorderLayout.SOUTH);
        
        // ActionListener registration
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        if (e.getSource() == b1) {
            int fact = 1;
            for (int i = 1; i <= num; i++)
                fact = fact * i;
            t2.setText(Integer.toString(fact));
        } else if (e.getSource() == b2) {
            int square = num * num;
            t2.setText(Integer.toString(square));
        } else if (e.getSource() == b3) {
            int cube = num * num * num;
            t2.setText(Integer.toString(cube));
        }
    }

    public static void main(String[] args) {
        new GUIBorderLayout();
    }
}
