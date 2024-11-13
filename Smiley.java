import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class Smiley extends Canvas
 {
    public void paint(Graphics g)
    {
        Font f = new Font("Times new Roman",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.RED);
        g.drawString("Keep Smiling!!",90,30);
        g.setColor(Color.YELLOW);
        g.fillOval(60,60,200,200);
        g.setColor(Color.BLACK);
        g.fillOval(90,120,30,20);
        g.fillOval(190,120,30,20);
        g.drawLine(155,125,155,170);
        g.drawArc(110,130,95,95,0,-180);
    }
    public static void main(String[] args) 
    {
        Smiley m = new Smiley();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}

