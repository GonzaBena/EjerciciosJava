package guia3;
public class Circle {
    private double x,y;
    private Point centro;
    private double radio;
    
    public Circle() {
        this(0.0,0.0,0);
    }

    public Circle(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        centro = new Point(x,y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double getArea()//Devuelve el área del círculo.
    {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public Point getCenter()//Devuelve el punto que representa el centro del círculo.
    {
        return centro;
    }
    
    public double getRadius()//Devuelve el radio del círculo.
    {
        return radio;
    }
    
    public double getPerimeter()//Devuelve la longitud de la circunferencia.
    {
        return 2 * Math.PI * radio;
    }
}
