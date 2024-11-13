import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIfactorial extends JFrame implements ActionListener
{
      JTextField t1,t2;
      JButton b1;
      JLabel L1,L2;
      public GUIfactorial()
      {
        t1=new JTextField(20);
        t2=new JTextField(20);
        L1=new JLabel("Enter number:");
        L2=new JLabel("Factorial:");
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
            int fact=1;
            for (int i=1;i<=num;i++)
            fact=fact*i;
              t2.setText(Integer.toString(fact));
               
        }
      }
        public static void main(String[] args)
            {
                GUIfactorial ob = new GUIfactorial();
            }
}
    
