/*Escribir un método que dada una matriz de enteros y un entero que representa un índice de fila, devuelva la columna que contiene el máximo elemento de esa fila.*/
package ej3;
public class Ej3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int fila = 1;
        System.out.println(Ej3.mayor(matrix, fila));
    }
    
    public static int mayor(int[][] matrix,int i)
    {
        int mayor = matrix[i][0];
        int fila = 0;
        for (int j = 0; j < matrix[i].length; j++) 
        {
            if (matrix[i][j] > mayor) {
                mayor = matrix[i][j];
                fila=j;
            }
        }
        return fila;
    }  
}
