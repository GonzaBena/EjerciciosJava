/*
Crear un arreglo de N elementos enteros. Imprimir por pantalla el mensaje: “Todos positivos” si todos sus elementos son positivos. 
En caso contrario imprimir por pantalla el mensaje: “No todos positivos”.
Nota: se debería utilizar una única sentencia if en la impresión del mensaje por pantalla.
 */
package ej3;

public class Ej3 {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        if (Ej3.posNeg(array)) 
        {
            System.out.println("Todos son positivos");
        }else
        {
            System.out.println("Todos son negativos");
        }
    }
    
    public static boolean posNeg(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] < 0) 
            {
                return false;
            }
        }
        return true;
    }
}
