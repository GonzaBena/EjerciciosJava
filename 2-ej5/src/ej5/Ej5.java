/*Escribir un método que dada una matriz de enteros devuelva la fila que contiene el máximo elemento de la matriz.*/
package ej5;
public class Ej5 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,0}};
        System.out.println(Ej5.fila(matrix));
    }
    
    public static int fila(int[][] matrix)
    {
        int mayor = matrix[0][0];
        int fila = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                    fila = i;
                }
            }
        }
        return fila;
    }
}
