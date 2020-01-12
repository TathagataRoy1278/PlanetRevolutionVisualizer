
public class Handlers
{
    Handlers(Body b)
    {
        new VHandler(b);
        new CHandler(b);
    }
}
class VHandler implements Runnable
{
    Body b;
    VHandler(Body b)
    {
        this.b=b;
    }
    public void run()
    {
        b.vx += b.ax;
    }
}