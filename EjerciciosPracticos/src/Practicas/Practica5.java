package Practicas;

public class Practica5 {
  
   	 public static void main(String[] args) {
	        int[] arreglo1 = {1, 2, 3};
	        int[] arreglo2 = {3,2,1};

	        int[] resultado = sumaArreglos(arreglo1, arreglo2);
	        System.out.print("Resultado de la suma: ");
	        for (int i = 0; i < resultado.length; i++) {
	            System.out.print(resultado[i] + " ");
	        }
	    }
	
	    public static int[] sumaArreglos(int[] arreglo1, int[] arreglo2) {
	        int[] resultado = new int[arreglo1.length]; 

	        for (int i = 0; i < arreglo1.length; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i]; 
	        }

	        return resultado; 
	    }

	   
	}


}
