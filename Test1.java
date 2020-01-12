public class Test1
{
    static Space s;
    public static void main(String[] args)
    {
        Body a = new Body(0,0);
        Body b = new Body(1,1);
        System.out.println(Calc.dist(a,b));
        System.out.println(new Vector(a,b).X);
    }
}