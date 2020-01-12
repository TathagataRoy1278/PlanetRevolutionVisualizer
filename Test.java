import java.awt.*;
public class Test
{
    static Space s;
    public static void main(String[] args)throws Exception
    {
        s = new Space();
       // Body a = new BlackHole(0,0,700,s);
       // Body c = new Body(-5000,2500,1,s);
        Body e = new BlackHole(0,0,7000,s);
        Body[] b = new Body[20];
        for(int i = 0;i<3;i++)
        {
            b[i]=new Body(5000,1000+500*i,1,s);
            b[i].changevx(-10);
            b[i].changevy(10);
            s.addBody(b[i]);
            b[i].start();
        }
        for(int i = 3;i<6;i++)
        {
            b[i]=new Body(-5000,1000+500*(i-4),1,s);
            b[i].changevx(10);
            b[i].changevy(-10);
            
            s.addBody(b[i]);
            b[i].start();
        }
        //Thread.sleep(3000);
        //Body d = new Body(10000,0,1 ,s);
        //Body b = null;
        //d.changevy((int)(200*1.414));
        //c.changevy(-200);
        
       // s.addBody(a);
      // s.addBody(c);
        s.addBody(e);
        e.start();
        Inspector i = new Inspector(s);
        
        
       /* while(true)
        {   a.changevx(0);
       a.changevy(0);}*/
    }
}