
/**
 * Write a description of class Calc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calc
{
    public static double dist(Body a, Body b)
    {
        return (Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2)));
    }
    public static double slopex(Body a, Body b)
    {
        try{
            double tan = ((double)a.y-b.y)/(a.x-b.x);
            double angle = Math.atan(tan);
            if(tan>0)
            if(a.x<0 && b.x<0 && a.y<0 && b.y<0)
                return -Math.cos(angle);
            else if(tan<0)
            {
              //  if 
            }
            return Math.sqrt(1.0/(1+tan*tan));
        }
        catch(ArithmeticException e)
        {
            return 0;
        }
    }
    
    public static double slopey(Body a, Body b)
    {
        double tan = (a.y-b.y)/(a.x-b.x);
        return Math.sqrt(1-(1.0/(1+tan*tan)));
    }
    
}
