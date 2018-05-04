package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int fila = 1;
        System.out.println(JavaApplication1.mayor(matrix, fila));
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
