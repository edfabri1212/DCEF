import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creación del vector para almacenar 12 números enteros
        int[] numeros = new int[12];

        // Variables para llevar el conteo
        int cantidadPares = 0;
        int cantidadImpares = 0;

        Scanner teclado = new Scanner(System.in);

        // 1. Lectura de los 12 números enteros
        System.out.println("Por favor, ingresa 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // 2. Procesamiento de los datos en el vector
        for (int i = 0; i < numeros.length; i++) {
            // Si el residuo de dividir entre 2 es cero, el número es par
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        // 3. Mostrar los resultados en pantalla
        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

        teclado.close();
    }
}