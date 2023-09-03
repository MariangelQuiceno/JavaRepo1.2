package Practicas;
import java.util.HashMap;
import java.util.Scanner;

public class Practica7 {
public static void main(String[] args) {
	        
	        HashMap<String, String> diccionario = new HashMap<>();
	        diccionario.put("apple", "manzana");
	        diccionario.put("car", "coche");
	        diccionario.put("cat", "gato");
	        diccionario.put("dog", "perro");
	        diccionario.put("house", "casa");

	        // Pedir al usuario que ingrese una palabra en ingl�s.
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Ingresa una palabra en ingl�s: ");
	        String palabraIngles = entrada.nextLine().toLowerCase(); // Convertir a min�sculas para que sea insensible a may�sculas.

	        // Buscar la traducci�n en el diccionario y mostrarla si est� presente.
	        if (diccionario.containsKey(palabraIngles)) {
	            String traduccion = diccionario.get(palabraIngles);
	            System.out.println("La traducci�n al espa�ol es: " + traduccion);
	        } else {
	            System.out.println("La palabra no est� en el diccionario.");
	        }
	    }
}



