import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

class GUIFlowLayoutDemo extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    public GUIFlowLayoutDemo()
    {
         b1= new JButton("Left");
         b2= new JButton("Center");
         b3= new JButton("Right");
        
        setLayout(new FlowLayout());
         add(b1);
         add(b2);
         add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent e)
    {
        int align=0;
        if(e.getSource()==b1)
        align=FlowLayout.LEFT;

        if(e.getSource()==b2)
        align=FlowLayout.CENTER;

        if(e.getSource()==b3)
        align=FlowLayout.RIGHT;
   
        setLayout(new FlowLayout( align));
        validate();
    }
    public static void main(String args[])
    {
        GUIFlowLayoutDemo ob = new GUIFlowLayoutDemo();   
    }
}
