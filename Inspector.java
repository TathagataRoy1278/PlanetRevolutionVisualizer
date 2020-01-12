import java.awt.*;
import javax.swing.*;
public class Inspector extends JFrame implements Runnable
{
    JTextArea a;
    Space s;
    Body[] bodies;
    Thread t;
    public Inspector(Space s)
    {
        a = new JTextArea(500,100);
        //this.bodies = bodies;
         bodies
         = s.getBodies();
        this.s = s;
        setSize(500,100);
            setVisible(true);
            add(a);
            t = new Thread(this);
            t.start();
    }
    public void run()
    {while(true){
        try{
        for(int i = 0;i<11;i++)
        {
            Body b = s.getBodies()[i];
            if(!(b instanceof BlackHole)&&b!=null)
            {//a.append("\n""\tvx = " +b.vx + "\tvy = "+b.vy+"\tx = "+b.x+"\ty = "+b.y);
           
                a.append(("\n"+b.uid+"\tax = "+b.ax + "\tay = " + b.ay+"\tvx = " +b.vx + "\tvy = "+b.vy+"\tx = "+b.x+"\ty = "+b.y));
              
            }
        }
        Thread.sleep(100);
        a.setText(null);
    }catch(Exception e){}}
    }
}
