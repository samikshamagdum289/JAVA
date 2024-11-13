import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIreverse extends JFrame implements ActionListener
{
      JTextField t1,t2;
      JButton b1;
      JLabel L1,L2;
      protected GUIreverse()
      {
        t1=new JTextField(25);
        t2=new JTextField(25);
        L1=new JLabel("Enter number:");
        L2=new JLabel("Reverse order:");
        b1=new JButton("Click");

        setLayout(new FlowLayout());
        add(L1);
        add(t1);
        add(L2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent e)
      {
        if(e.getSource()==b1)
        {
            int num = Integer.parseInt(t1.getText());
            int reminder,reverse=0;
            while(num!=0)
            {
              reminder=num%10;
              reverse=reverse*10+reminder;
              num=num/10;
            }
              t2.setText(Integer.toString( reverse ));
         }
      }
      public static void main(String[] args)
            {
                GUIreverse ob = new GUIreverse();
            }
}
    

