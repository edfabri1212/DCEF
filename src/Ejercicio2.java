import java.util.Scanner;

public class Ejercicio2 {

    public static class PromedioVector {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int[] numeros = new int[12];
            double suma = 0.0;

            System.out.println("--- Registro de 12 Números Enteros ---");


            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa el número entero para la posición [" + (i + 1) + "]: ");
                numeros[i] = scanner.nextInt();
            }


            for (int numero : numeros) {
                suma += numero;
            }


            double promedio = suma / numeros.length;


            System.out.println("\n--- Resumen del Vector ---");
            System.out.print("Números ingresados: ");


            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
            }

            System.out.println();
            System.out.printf("La suma total es:   %.0f%n", suma);
            System.out.printf("El promedio es:     %.2f%n", promedio);

            scanner.close();
        }
    }
}