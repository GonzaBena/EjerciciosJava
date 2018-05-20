package guia3;

public class Point 
{
    private double x;
    private double y;
    
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    public Point add(Point a)
    {
        Point nuevo = new Point();
        nuevo.x = (this.x + a.x);
        nuevo.y = (this.y + a.y);
        return nuevo;
    }
}
