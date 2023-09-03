package Practicas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Practica8 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>> notasEstudiantes = new HashMap<>();

        while (true) {
            String opciones = JOptionPane.showInputDialog(
                    "Opciones:\n" +
                            "1. Agregar estudiante y asignar nota(s).\n" +
                            "2. Consultar nota de un estudiante.\n" +
                            "3. Salir.\n" +
                            "Selecciona una opción:"
            );

            try {
                int opcion = Integer.parseInt(opciones);

                switch (opcion) {
                    case 1:
                        agregarEstudiante(notasEstudiantes);
                        break;
                    case 2:
                        consultarNota(notasEstudiantes);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para la opción.");
            }
        }
    }

    public static void agregarEstudiante(HashMap<String, ArrayList<Double>> notasEstudiantes) {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante:");
        ArrayList<Double> notas = new ArrayList<>();

        try {
            int cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas:"));

            for (int i = 0; i < cantidadNotas; i++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota #" + (i + 1) + " para " + nombre + ":"));
                notas.add(nota);
            }

            notasEstudiantes.put(nombre, notas);
            JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para la cantidad de notas.");
        }
    }

    public static void consultarNota(HashMap<String, ArrayList<Double>> notasEstudiantes) {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante para consultar sus notas:");

        if (notasEstudiantes.containsKey(nombre)) {
            ArrayList<Double> notas = notasEstudiantes.get(nombre);
            String mensaje = "Las notas de " + nombre + " son:\n";
            for (int i = 0; i < notas.size(); i++) {
                mensaje += "Nota " + (i + 1) + ": " + notas.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante no se encuentra en la lista.");
        }
    }
}



