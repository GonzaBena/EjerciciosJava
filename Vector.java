package guia3;

import java.util.Arrays;

public class Vector 
{
    private double[] vector;
   
    public Vector(int coordinateCount)//Crea un vector de coordinateCount dimensiones con sus coordenadas en 0.
    {
        vector = new double[coordinateCount];
        Arrays.fill(vector, 0);
    }
    
    public Vector(double[] coordinates)//Crea un vector con sus coordenadas inicializadas con los valores que tiene el arreglo coordinates.
    {
        vector = new double[coordinates.length];
        System.arraycopy(coordinates, 0, this.vector, 0, coordinates.length);
    }
    
    public double getCoordinate(int index)//Devuelve la coordenada i-ésima del vector.
    {
        return this.vector[index];
    }
    
    public double norm()//Devuelve la norma del vector.
    {
        double nuevo = 0;
        for (int i = 0; i < this.vector.length; i++) {
            nuevo += Math.pow(this.vector[i], 2.0);
        }
        nuevo = Math.sqrt(nuevo);
        return nuevo;
    }
    
    public Vector add(Vector aVector)//Devuelve un nuevo vector que es la suma de las coordenadas de this con las coordenadas de aVector.
    {
        int longitud = Math.max(this.vector.length, aVector.vector.length);
        double[] nuevo = new double[longitud];
        for (int i = 0; i < longitud; i++) {
            nuevo[i] = this.vector[i] + aVector.vector[i];
        }
        Vector nuevo1 = new Vector(nuevo);
        return nuevo1;
    }
    
    public double dotProduct(Vector aVector)//Devuelve el producto escalar entre el vector representado por this y el vector aVector.
    {
        double nuevo = 0;
        for (int i = 0; i < Math.max(this.vector.length, aVector.vector.length); i++) {
            nuevo += this.vector[i] * aVector.vector[i];
        }
        return nuevo;
    }
    
    public double[] vector()
    {
        double[] nuevo = new double[vector.length];
        System.arraycopy(vector, 0, nuevo, 0, vector.length);
        return nuevo;
    }
}
