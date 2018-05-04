/*Escribir un método que dada una matriz de enteros devuelva la suma de los elementos que contiene la matriz.*/
package ej1;
public class Ej1 {
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("la suma es: " + Ej1.suma(matrix));
    }
    
    public static int suma(int[][] matrix)
    {
        int suma = 0;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                suma += matrix[i][j];
            }
        }
        return suma;
    }
}
