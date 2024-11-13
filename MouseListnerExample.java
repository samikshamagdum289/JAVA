import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListnerExample extends JFrame implements MouseListener
{
  MouseListnerExample()
  {
     addMouseListener(this);
     setSize(400,400);
     setLayout(null);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void mouseClicked(MouseEvent e)
  {
   Graphics g = getGraphics();
   g.setColor(Color.RED);
   g.fillRect(e.getX(),e.getY(),30,30);
  }
 public void mouseEntered(MouseEvent e){}
 public void mouseExited(MouseEvent e){}
 public void mousePressed(MouseEvent e){}
 public void mouseReleased(MouseEvent e){}

 public static void main(String args[])
{
  new MouseListnerExample();
}

}
