import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javafx.scene.shape.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.geom.AffineTransform;
public class Space extends JFrame
{
    int ctr = 0;
    int ui = 0;
    Body[] bodies = new Body[100];
    public Space()
    {
        setSize(2000,1000);
        setVisible(true);
		
        repaint();
    }
    public void addBody(Body b)
    {
        bodies[ctr++] = b;
    }
    public Body[] getBodies()
    {return bodies; 
    }
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        AffineTransform tform = AffineTransform.getTranslateInstance( getWidth()/2, getHeight()/2);
        tform.scale(0.1,-0.1);
        g2.setTransform(tform);
        if(ui==0){
            g2.setColor(Color.BLACK);
        g2.fillRect(-20000,-10000,40000,20000);
        }
       ui++;
    
        for(int i = 0;i<ctr;i++)
        {
            Body b = bodies[i];
           Ellipse2D.Double c = new Ellipse2D.Double(b.x,b.y,100,100);
           //c.
            g2.setColor(
            new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250)));
           // System.out.println(i+"\t"+ctr+"\t"+b.x+"\t"+b.y);
            g2.fill(c);
        }
        try{Thread.sleep(0);
        }
        catch(Exception e){}
        repaint();
    }
}