/*Escribir un método que dada una matriz de enteros y un entero que representa un índice de columna, 
devuelva la fila que contiene el máximo elemento de esa columna.*/
package ej4;
public class Ej4 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int fila = 1;
        System.out.println(Ej4.mayor(matrix, fila));        
    }
    
    public static int mayor(int[][] matrix,int i)
    {
        int mayor = matrix[i][0];
        int fila = 0;
        for (int j = 0; j < matrix.length; j++) 
        {
            if (matrix[j][i] > mayor) {
                mayor = matrix[j][i];
                fila=j;
            }
        }
        return mayor;
    } 
}
