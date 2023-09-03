package Practicas;
import java.util.ArrayList;

/*Realice un algoritmo que use un M�todo con par�metros y 
 * con retorno que recibe un ArrayList de enteros y devuelve el valor m�ximo de la lista*/


public class Practica5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(5);
        lista.add(25);
        lista.add(30);
        lista.add(15);

        int maximo = encontrarMaximo(lista);
        System.out.println("El valor m�ximo en la lista es: " + maximo);
    }

    public static int encontrarMaximo(ArrayList<Integer> lista) {

        int maximo = lista.get(0); // Suponemos que el primer elemento es el m�ximo inicialmente.

        for (int i = 1; i < lista.size(); i++) {
            int elementoActual = lista.get(i);
            if (elementoActual > maximo) {
                maximo = elementoActual; // Actualizamos el m�ximo si encontramos un valor mayor.
            }
        }

        return maximo;
    }
}
