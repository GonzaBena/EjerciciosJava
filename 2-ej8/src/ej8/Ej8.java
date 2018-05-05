/*Escribir un método que dada una matriz de enteros y un entero, 
devuelva la posición de la matriz en la que se encuentra ese entero, 
o un valor que indique que el entero no se encuentra en la matriz.*/
package ej8;
import java.util.Arrays;
public class Ej8 {
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int nab = 0;
        int[] result = Ej8.busqueda(matrix, nab);
            if (result[0] == -1) {
                System.out.println("el entero no se encuentra en la matriz");
            }else{
                System.out.println(Arrays.toString(result));
            }             
    }
    
    public static int[] busqueda(int[][] matrix, int nab)
    {
        int[] pos = {-1,-1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == nab) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
}
