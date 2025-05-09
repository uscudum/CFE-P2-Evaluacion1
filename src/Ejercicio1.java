import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad =  scanner.nextInt();
        System.out.print("¿Está estudiando actualmente? (true/false): ");
        boolean estudiando = scanner.nextBoolean();
        System.out.print("¿Trabaja actualmente? (true/false): ");
        boolean trabaja = scanner.nextBoolean();

        if (edad < 18 && estudiando){
            System.out.println("Accede al beneficio (Menor de edad y estudiando)");
        }else if (edad >= 18 && edad <= 25 && estudiando && !trabaja){
            System.out.println("Accede al beneficio (Entre 18 y 25, estudia y no trabaja)");
        }else if (edad > 60){
            System.out.println("Accede al beneficio (Mayor de 60)");
        }else{
            System.out.println("No accede al beneficio");
        }

    }
}
