package clases;
public class Vector3D 
{
    private double x;
    private double y;
    private double z;
    
    public Vector3D()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getZ()
    {
        return this.z;
    }
    
    public Vector3D add(Vector3D a)
    {
        Vector3D nuevo = new Vector3D();
        nuevo.x = this.x + a.x;
        nuevo.y = this.y + a.y;
        nuevo.z = this.z + a.z;
        return nuevo;
    }

    public double doProduct(Vector3D aVector) 
    {
        double scalar;
        this.x *= aVector.getX();
        this.y *= aVector.getY();
        this.z *= aVector.getZ();
        scalar = this.x + this.y + this.z;
        return scalar;
    }
    
    public double norm()
    {
        return 0.0;
    }
}