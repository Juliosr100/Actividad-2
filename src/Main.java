

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();

        int[] calificaciones = new int[5];
        int suma=0;
        int promedio;

        System.out.println("Ingrese las calificaciones del alumno:");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
            suma=calificaciones[i]+suma;
        }
        promedio=suma/5;
        char calificacion;

        if (promedio <= 50) {
            calificacion = 'F';
        } else if (promedio <= 60) {
            calificacion = 'E';
        } else if (promedio <= 70) {
            calificacion = 'D';
        } else if (promedio <= 80) {
            calificacion = 'C';
        } else if (promedio <= 90) {
            calificacion = 'B';
        } else {
            calificacion = 'A';
        }


        System.out.println("Nombre del estudiante: "+nombreAlumno);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: "+promedio );
        System.out.println("La calificación final es: " + calificacion);
    }
}
