import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIcolor extends JFrame implements ActionListener
{
    JButton R,G,B;
    public GUIcolor()
    {
       R= new JButton("Red");
       G= new JButton("Green");
       B= new JButton("Blue");
       R.setBounds(40,100,60,30);
       G.setBounds(120,100,80,30);
       B.setBounds(220,100,60,30);
       setLayout(null);
       add(R);
       add(G);
       add(B);

       R.addActionListener(this);
       G.addActionListener(this);
       B.addActionListener(this);
       setSize(400,400);
       setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==R)
        {
            getContentPane().setBackground(Color.RED);
        }
        if(e.getSource()==G)
        {
            getContentPane().setBackground(Color.GREEN);
        }
        if(e.getSource()==B)
        {
            getContentPane().setBackground(Color.BLUE);
        }
    }
    public static void main(String args[])
    {
        GUIcolor ob = new GUIcolor();
    }
}