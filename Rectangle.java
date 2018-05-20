package guia3;
public class Rectangle {
    private double x,y,a,s;
    private Point altura1;
    private Point ancho1;
    private Point altura2;
    private Point ancho2;

    public Rectangle() {
        this(0,0,0,0);
    }
    
    public Rectangle(double a, double s, double x, double y) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.s = s;
        altura1 = new Point(x,y);
        ancho1 = new Point(a,s);
        altura2 = new Point(x,s);
        ancho2 = new Point(a,y);
    }

    public double getAltura1() {
        return y;
    }

    public double getAncho1() {
        return x;
    }
    
    public double getArea()//Devuelve el área del rectángulo.
    {
        return x*s;
    }
    
    public Point getOrigin()//Devuelve el punto que representa la esquina superior izquierda del rectángulo.
    {
        return altura1;
    }
    
    public Point getCorner()//Devuelve el punto que representa la esquina inferior derecha del rectángulo.
    {
        return ancho1;
    }
    
    public double getPerimeter()//Devuelve el perímetro del rectángulo.
    {
        return (y*2)+(x*2);
    }
}
