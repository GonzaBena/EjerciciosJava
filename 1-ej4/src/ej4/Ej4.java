/*
Crear un arreglo boléanos de N elementos. 
Calcular e imprimir por pantalla el producto de la cantidad de los elementos que en una posición 
par del arreglo son true por la cantidad de elementos que en posición impar son false.
 */
package ej4;
public class Ej4 {
    public static void main(String[] args) {
        boolean[] bool = {true,false,true,false,true};
        System.out.println("El producto es: " + Ej4.buleano(bool));
    }
    
    public static int buleano(boolean[] bool)
    {
        int verdadero = 0,falso = 0;
        for (int i = 0; i < bool.length; i++) 
        {
            if (bool[i]) 
            {
                verdadero ++;
            }else
            {
                falso ++;
            }
        }
        return verdadero*falso;        
    }
}
