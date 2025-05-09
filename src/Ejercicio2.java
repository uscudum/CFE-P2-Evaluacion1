import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int matriz [][] = new int[7][3];

        for(int i = 0 ; i < matriz.length ; i++){
            System.out.println("Día " + (i+1));
            System.out.println("-------------");
            for(int j = 0; j < matriz[i].length ; j++){
                System.out.print("Temperatura turno " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        for(int i = 0 ; i < matriz.length ; i++){
            int tempMin = matriz[i][0];
            int tempMax = matriz[i][0];
            double promedio = matriz[i][0];
            for(int j = 1; j < matriz[i].length ; j++){

                if (tempMin > matriz[i][j]){
                    tempMin = matriz[i][j];
                }

                if (tempMax < matriz[i][j]){
                    tempMax = matriz[i][j];
                }

                promedio += matriz[i][j];
            }
            System.out.println("Temp min día " + (i+1) + " :" + tempMin + "ºC");
            System.out.println("Temp max día " + (i+1) + " :" + tempMax + "ºC");
            System.out.println("Promedio día " + (i+1) + " :" + promedio/3 + "ºC");
            System.out.println("------------------------------------------------");
        }


    }
}
