package Practicas;
import java.util.Random;

/*Escribe un m�todo sin par�metros y con retorno que genere un n�mero aleatorio 
 * entre 1 y 100 y lo devuelva como resultado.
 */

public class Practica3 {

    public static void main(String[] args) {
        int numeroAleatorio = generarNumero();
        System.out.println("N�mero aleatorio: " + numeroAleatorio);
    }

    public static int generarNumero() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        return numeroAleatorio;
    }
}
