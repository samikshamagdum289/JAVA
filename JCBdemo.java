import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JCBdemo extends JFrame implements ItemListener
{
  JLabel l1;
  ImageIcon Virat,Mahi,SKY,Shubman;

  public JCBdemo()
  {
   setTitle("ComboboxDemo");
   setLayout(new FlowLayout());
   l1=new JLabel();
   add(l1);
   
   JComboBox<String> jc = new JComboBox<String>();
   jc.addItem("Select Image");
   jc.addItem("Virat");
   jc.addItem("Mahi");
   jc.addItem("SKY");
   jc.addItem("Shubman");
   jc.addItemListener(this);
   add(jc);
   setSize(400,400);
   setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
public void itemStateChanged(ItemEvent e)
 {
  String s = (String)e.getItem();
  l1.setIcon(new ImageIcon(s+ ".jpg"));
 }
public static void main(String args[])
 {
 JCBdemo ob = new JCBdemo();
 }
} 


