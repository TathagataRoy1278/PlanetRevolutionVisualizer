public class Vector
{
    double x1,x2,y1,y2;
    double X,Y;
    Body a,b;
    Vector(Body a,Body b)
    {
        x1 = a.x;
        x2 = b.x;
        y1 = a.y;
        y2 = b.y;
        this.a = a;
        this.b = b;
        calculateX();
        calculateY();
    }
    
    void calculateX()
    {
        X = (x2-x1)/Calc.dist(a,b);
    }
    
    void calculateY()
    {
        Y = (y2-y1)/Calc.dist(a,b);
    }
}