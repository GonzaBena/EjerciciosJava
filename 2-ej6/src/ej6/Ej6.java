/*Escribir un método que dada una matriz de enteros devuelva la columna que contiene el máximo elemento de la matriz.*/
package ej6;
public class Ej6 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,0}};
        System.out.println(Ej6.fila(matrix));
    }
    
    public static int fila(int[][] matrix)
    {
        int mayor = matrix[0][0];
        int fila = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                    fila = j;
                }
            }
        }
        return fila;
    }
}
