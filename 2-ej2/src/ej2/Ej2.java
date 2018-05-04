/*Escribir un método que dada una matriz de enteros devuelva la cantidad de elementos positivos que contiene la matriz.*/
package ej2;
public class Ej2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Ej2.pos(matrix));
    }
    
    public static int pos(int[][] matrix)
    {
        int pos = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    pos ++;
                }
            }
        }
        return pos;
    }
}
