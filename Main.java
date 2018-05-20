package guia3;

public class Main {
  public static void main(String[] args) 
    {
        Vector3D a = new Vector3D(3,5,6);
        Vector3D b = new Vector3D(2,4,8);
        Vector3D c = new Vector3D();
        Vector3D resultado = a.add(b);
        
        System.out.println(resultado.getX());
        System.out.println(resultado.getY());
        System.out.println(resultado.getZ());
        System.out.println(resultado.dotProduct(b));
        System.out.println("a " + a.getX());
        System.out.println("a " + a.getY());
        System.out.println("a " + a.getZ());
        System.out.println("b " + b.getX());
        System.out.println("b " + b.getY());
        System.out.println("b " + b.getZ());
        System.out.println("c " + c.getX());
        System.out.println("c " + c.getY());
        System.out.println("c " + c.getZ());        
    }
}
