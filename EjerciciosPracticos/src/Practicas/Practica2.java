package Practicas;

/* Escribe un m�todo con par�metros y sin retorno que reciba un 
 * n�mero entero y lo imprima en pantalla si es mayor que 10. */


public class Practica2 {

    public static void main(String[] args) {
        int numero = 20; 
        mayorQue10(numero);
    }

    public static void mayorQue10(int numero) {
        if (numero > 10) {
            System.out.println("El n�mero " + numero + " es mayor que 10: ");
        }
    }
}
