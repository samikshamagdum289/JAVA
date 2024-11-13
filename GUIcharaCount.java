import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class GUIcharaCount extends JFrame implements ActionListener
{  
    JLabel l1,l2;  
    JTextField t1;  
    JButton b1;  
    
    GUIcharaCount()
    {  
        setTitle("Character word count");  
        l1=new JLabel("Characters: ");  
        l1.setBounds(50,50,100,20);  
        l2=new JLabel("Words: ");  
        l2.setBounds(50,80,100,20);  
          
        t1=new JTextField();  
        t1.setBounds(50,110,300,200);  
          
        b1=new JButton("click");  
        b1.setBounds(50,320, 80,30);//x,y,w,h  
        b1.addActionListener(this);  
      
        add(l1);
        add(l2);
        add(t1);
        add(b1);  
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e)
    {  
        if(e.getSource()==b1)
        {  
        String text=t1.getText();  
        l1.setText("Characters: "+text.length());  
        String words[]=text.split("\\s");  
        l2.setText("Words: "+words.length);  
        }
    }  
public static void main(String args[])
  {  
    GUIcharaCount ob = new GUIcharaCount();  
  }
}  
