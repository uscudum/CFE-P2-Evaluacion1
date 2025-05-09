import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        int[] calificaciones = new int[cantidadEstudiantes];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación del estudiante " + (i + 1) + ": ");
            int nota = scanner.nextInt();

            if (nota >= 1 && nota <= 12) {
                calificaciones[i] = nota;
            } else {
                System.out.println("La calificación no es válida. 1 por defecto.");
                calificaciones[i] = 1;
            }
        }

        clasificarCalificaciones(calificaciones);
    }

    public static void clasificarCalificaciones(int[] calificaciones) {
        int contadorInsuficiente = 0;
        int contadorAceptable = 0;
        int contadorBueno = 0;
        int contadorExcelente = 0;

        for (int nota : calificaciones) {
            if (nota >= 1 && nota <= 5) {
                contadorInsuficiente++;
            } else if (nota >= 6 && nota <= 7) {
                contadorAceptable++;
            } else if (nota >= 8 && nota <= 10) {
                contadorBueno++;
            } else if (nota >= 11 && nota <= 12) {
                contadorExcelente++;
            }
        }

        System.out.println("Resumen de categorías:");
        System.out.println("Insuficiente: " + contadorInsuficiente);
        System.out.println("Aceptable: " + contadorAceptable);
        System.out.println("Bueno: " + contadorBueno);
        System.out.println("Excelente: " + contadorExcelente);
    }
}

