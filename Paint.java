import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Pain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paint extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Pain
     */
    public Paint()
    {
      setSize(2000,1000);
      setVisible(true);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void paint(Graphics g)
    {
        try
        {
         //  for(int j = 0;j<1000;j++)
       //   {  Thread.sleep(5);
        for(int i = 0;i<2000;i+=0.1)
        {
            g.drawOval(i,i,(int)(i*(Math.abs(Math.sin(Math.toRadians(i))))),(int)(i*(Math.abs(Math.sin(Math.toRadians(i))))));
          //  g.setColor(new Color((int)(i*Math.abs(Math.sin(Math.toRadians(i))))%250,0,(int)(i*Math.abs(Math.sin(Math.toRadians(i))))%250));
         
            g.setColor(new Color(0,0,0));
          //   Thread.sleep(10);
        }
        //super.paint(g);
   // }
    }
    catch(Exception e){}
    }
}
