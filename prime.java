import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class prime extends JFrame implements ActionListener
{
      JTextField t1,t2;
      JButton b1;
      JLabel L1,L2;
      public prime()
      {
        t1=new JTextField(20);
        t2=new JTextField(20);
        L1=new JLabel("Enter number:");
        L2=new JLabel("Result:");
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
            int count=0;
            for (int i=2;i<num/2;i++)
            {
                if(num %i ==0)
                count++;
            }
            if(count==2)
              t2.setText("not prime");
            else
              t2.setText("prime");     
        }
      }
        public static void main(String[] args)
            {
                prime ob = new prime();
            }
}
    
