package Practicas;

/*Realice un algoritmo que use un Método con parámetros y con retorno que recibe dos arreglos de enteros del mismo tamaño y 
 * devuelve un nuevo arreglo que contiene la suma de los elementos de ambos arreglos:
 */

public class Practica6 {
public static void main(String[] args) {
	
	int[] arreglo1 = {1, 2, 3};
	int[] arreglo2 = {3, 2, 1};

	int[] resultado = sumarArreglos(arreglo1, arreglo2);

	System.out.print("Resultado de la suma: ");
	for (int i = 0; i < resultado.length; i++) {
	System.out.print(resultado[i] + " ");
	}
}

public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
	      
	if (arreglo1.length != arreglo2.length) {
	System.out.print("Los arreglos deben tener el mismo tamaño.");
	}

	int[] resultado = new int[arreglo1.length];

	for (int i = 0; i < arreglo1.length; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i];
	}

	 return resultado;
}
	

}



