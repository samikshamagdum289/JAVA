import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIBinaryOctalHex extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3;

    GUIBinaryOctalHex() {
        setLayout(new BorderLayout());
        l1 = new JLabel("Number");
        l2 = new JLabel("Result");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Binary");
        b2 = new JButton("Octal");
        b3 = new JButton("Hex");

        Dimension buttonSize = new Dimension(100, 100);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);

        JPanel jp1 = new JPanel();
        jp1.add(l1);
        jp1.add(t1);
        add(jp1, BorderLayout.NORTH);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1, BorderLayout.WEST);
        add(b2, BorderLayout.CENTER);
        add(b3, BorderLayout.EAST);

        JPanel jp2 = new JPanel();
        jp2.add(l2);
        jp2.add(t2);
        add(jp2, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        if (e.getSource() == b1) {
            t2.setText(Integer.toBinaryString(num));
        } else if (e.getSource() == b2) {
            t2.setText(Integer.toOctalString(num));
        } else if (e.getSource() == b3) {
            t2.setText(Integer.toHexString(num));
        }
    }

    public static void main(String[] args) {
        new GUIBinaryOctalHex();
    }
}
