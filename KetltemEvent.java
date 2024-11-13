import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KetltemEvent extends JFrame {
     JTextField t1;
     JCheckBox c1, c2, c3;
     JLabel l1;
     public KetltemEvent() {
       
        t1 = new JTextField(20);
        setTitle("Key and Item Events");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

       
        c1 = new JCheckBox("MHTCET");
        c2 = new JCheckBox("JEE");
        c3 = new JCheckBox("NEET");
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (c1.isSelected()) {
                    l1.setText("Option 1 Selected");
                } else {
                    c2.setSelected(false);
                    c3.setSelected(false);
                    l1.setText("No Options Selected");
                }
            }
        });
        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (c2.isSelected()) {
                    l1.setText("Option 2 Selected");
                } else {
                    c1.setSelected(false);
                    c3.setSelected(false);
                    l1.setText("No Options Selected");
                }
            }
        });
        c3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (c3.isSelected()) {
                    l1.setText("Option 3 Selected");
                } else {
                    c1.setSelected(false);
                    c2.setSelected(false);
                    l1.setText("No Options Selected");
                }
            }
        });
    


        add(t1);
        JPanel Panel = new JPanel();
        Panel.add(c1);
        Panel.add(c2);
        Panel.add(c3);
        add(Panel, BorderLayout.CENTER);


        t1 = new JTextField(20);
        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                l1.setText("Key Pressed: " + e.getKeyCode());
            }

            public void keyReleased(KeyEvent e) {
                l1.setText("Key Released: " + e.getKeyCode());
            }

            public void keyTyped(KeyEvent e) {
                l1.setText("Key Typed: " + e.getKeyChar());
            }
        });
       
        add(t1, BorderLayout.NORTH);


        l1 = new JLabel("No Options Selected");
        add(l1, BorderLayout.SOUTH);


        setVisible(true);
    }

    public static void main(String[] args) {
        new KetltemEvent();
    }
}

