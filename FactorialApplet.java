import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class FactorialApplet extends Applet implements ActionListener
{
    Button b1;
    Label l1,l2;
    TextField t1,t2;
    public void init()
    {
        l1 = new Label("Factorial");
        t1 = new TextField(20);
        l2 = new Label();
        t2 = new TextField(20);
        b1 = new Button("Click");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
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
}    
