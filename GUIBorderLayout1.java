import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIBorderLayout extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3;
    GUIBorderLayout()
    {
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
        add(jp1,BorderLayout.NORTH);

        b1.addActionListener(this);
        add(b1,BorderLayout.WEST);
        add(b2,BorderLayout.CENTER);
        add(b3,BorderLayout.EAST);

        JPanel jp2 = new JPanel();
        jp2.add(l2);
        jp2.add(t2);
        add(jp2,BorderLayout.SOUTH);
        b1.addActionListener(this);
        b2.addActionListener(this); 
        b3.addActionListener(this); 


        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e)
    {
                int num = Integer.parseInt(t1.getText());
                if (e.getSource() == b1) 
                {
                    String binaryString = toBinary(number);
                    {
                        if (decimal == 0) {
                            return "0";
                        }
                        
                        StringBuilder binary = new StringBuilder();
                        while (decimal > 0) {
                            // Append the remainder (0 or 1) to the beginning of the string
                            binary.insert(0, decimal % 2);
                            decimal = decimal / 2;
                        }
                        return binary.toString();
                    }

                    t2.setText(Integer.toString(decimal));
                } 
                else if (e.getSource() == b2) 
                {
                    int square = num * num;
                    t2.setText(Integer.toString(square));
                } 
                else if (e.getSource() == b3) 
                {
                    int cube = num * num * num;
                    t2.setText(Integer.toString(cube));
                }
    } 
        
     public static void main(String[] args) 
    {
        GUIBorderLayout ob =  new GUIBorderLayout(); 
    }
}


