package Practicas;

/* Escribe un m�todo con par�metros y con 
 * retorno que reciba un arreglo de enteros y devuelva el valor m�ximo del arreglo.
 */

public class Practica4 {

    public static void main(String[] args) {
        int[] arreglo = {30, 90, 25, 1, 2}; 
        int maximo = encontrarMaximo(arreglo);
        System.out.println("El valor m�ximo del arreglo es: " + maximo);
    }

    public static int encontrarMaximo(int[] arreglo) {
    	
        int maximo = arreglo[0]; // Suponemos que el primer elemento es el m�ximo inicialmente.

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        return maximo;
    }
}
