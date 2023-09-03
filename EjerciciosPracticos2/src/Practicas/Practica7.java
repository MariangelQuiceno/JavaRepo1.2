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

	        // Pedir al usuario que ingrese una palabra en inglés.
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Ingresa una palabra en inglés: ");
	        String palabraIngles = entrada.nextLine().toLowerCase(); // Convertir a minúsculas para que sea insensible a mayúsculas.

	        // Buscar la traducción en el diccionario y mostrarla si está presente.
	        if (diccionario.containsKey(palabraIngles)) {
	            String traduccion = diccionario.get(palabraIngles);
	            System.out.println("La traducción al español es: " + traduccion);
	        } else {
	            System.out.println("La palabra no está en el diccionario.");
	        }
	    }
}



