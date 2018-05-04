/**/
package ej7;

import java.util.Arrays;

public class Ej7 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,0}};
        System.out.println(Arrays.toString(Ej7.fila(matrix)));
    }
    
    public static int[] fila(int[][] matrix)
    {
        int mayor = matrix[0][0];
        int[] fila = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                    fila[0] = i;
                    fila[1] = j;
                }
            }
        }
        return fila;
    }
}
