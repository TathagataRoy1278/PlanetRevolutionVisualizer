import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Body implements Runnable
{
    // instance variables - replace the example below with your own
    double x;
    double y;
    double a;
    double ax;
    double ay;
    double vx;
    double vy;
    int mass;
    long uid;
    Thread t;
    Color c;
     
    Space s;
    /**
     * Constructor for objects of class Body
     */
    public void run()
    {
        while(true)
        {
        try{
        Body[] bodies = s.getBodies();
        for(int i = 0;i<bodies.length;i++)
        {
            Body b = bodies[i];
            if(b!=null&&b.uid!=uid)
            {
                double a = 0.1*(b.mass/GB.SM)/(Math.pow(Calc.dist(this,b)/GB.SD,2));
                Vector v = new Vector(this,b);
                
               // System.out.println(b.uid +"\t" +this.uid);
            
               // if(a==0)
               // a=1;
                
                ax += (a*v.X);
                ay += (a*v.Y);
                
            }}
            
                vx += (ax);
                
                
                //System.out.println(vy);
                
                
                vy += (ay);
                
                x += (vx);
                y += (vy);
           ax=0;
           ay =0;
                Thread.sleep(10);
        
        }
        catch(Exception e){
        System.out.println("asd");
        }
    }
    }
    public Body()
    {
        x = (int)(Math.random()*500);
        y = (int)(Math.random()*250);
        //s = ss;
        mass = 1;
        uid = (int)(Math.random()*Math.random()*Math.random()*89651235);
        
        
        Thread t = new Thread(this);
       
    }
    
    public Body(int x,int y,int m,Space s)
    { this.x = x;
        this.y = y;
        this.s = s;
        mass = m;
        uid = (int)(Math.random()*Math.random()*Math.random()*89651235);
        c = new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250));
       // vy=(int)( 200*Math.sqrt(2));
        //vy =(int)( Math.random()*10);
        
       t= new Thread(this);
    }
    
    public void start()
    {
        t.start();
    }
    
    public void changevx(double n)
    {
        vx = n;
    }
    public void changevy(double n)
    {
        vy = n;
    }
}
