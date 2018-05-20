package guia3;
public class Triangle {
    
    private Point arriba;
    private Point izquierda;
    private Point derecha;
    
    private Point[] vertices = new Point[3];

    public Triangle(Point arriba, Point izquierda, Point derecha) {
        this.arriba = new Point(arriba.getX(),arriba.getY());
        this.izquierda = new Point(izquierda.getX(),izquierda.getY());
        this.derecha = new Point(derecha.getX(),derecha.getY());
        this.vertices[0] = arriba; 
        this.vertices[1] = izquierda; 
        this.vertices[2] = derecha;
    }
    
    public double getArea()//Devuelve el área del triángulo.
    {
        //(base*altura)/2
        double altura = Math.max(arriba.getY(), izquierda.getY()) - Math.min(arriba.getY(), izquierda.getY());
        double base = Math.max(derecha.getX(), izquierda.getX()) - Math.min(derecha.getX(), izquierda.getX());
        return (base * altura)/2; 
    }
    
    public Point[] getVertices()//Devuelve un arreglo que contiene los puntos que forman los vértices del triángulo.
    {
        return this.vertices;
    }
    
    public Point getVertex(int index)//Devuelve uno de los puntos que forman los vértices del triángulo.
    {
        return this.vertices[index];
    }
    
    public double getPerimeter()//Devuelve el perímetro del triángulo.
    {
        double altura = Math.max(arriba.getY(), izquierda.getY()) - Math.min(arriba.getY(), izquierda.getY());
        double base = Math.max(derecha.getX(), izquierda.getX()) - Math.min(derecha.getX(), izquierda.getX());
        return base + altura*2;
    }
}
