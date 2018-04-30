/*
Crear un arreglo de N elementos enteros. Llenar el arreglo con N números enteros provistos por el usuario.
Escribir una función que tome como parámetro el arreglo y devuelva la posición del elemento más chico del arreglo.
Imprimir por pantalla el menor de los elementos del arreglo.
 */
package ej1;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args)
    {
        int n = 0;
        Scanner entry = new Scanner(System.in);
        System.out.print("Ingrese el tamano del Array: ");
        n = entry.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length ;i++)
        {
            System.out.print("Ingrese los valores del Array: ");
            array[i] = entry.nextInt();
        }
        System.out.println("El menor numero es: "+Ej1.menor(array));
    }

    public static int menor(int[] array)
    {
        int menor = array[0];
        for(int i = 1; i < array.length;i++)
        {
            if (menor > array[i])
            {
                menor = array[i];
            }
        }
        return menor;
    }
}
