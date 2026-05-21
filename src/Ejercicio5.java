import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos una matriz de 3 filas y 3 columnas (3x3 = 9 artículos)
        String[][] articulos = new String[3][3];
        int contador = 1;

        // 1. Solicitar y almacenar los 9 nombres de artículos
        System.out.println("Por favor, ingresa los nombres de los 9 artículos:");
        for (int f = 0; f < 3; f++) { // Controla las filas
            for (int c = 0; c < 3; c++) { // Controla las columnas
                System.out.print("Artículo " + contador + " [Fila " + f + "][Columna " + c + "]: ");
                articulos[f][c] = teclado.nextLine();
                contador++;
            }
        }

        // 2. Mostrar la matriz en el orden de las filas invertido
        System.out.println("\n--- Matriz con Filas Invertidas ---");
        // El bucle de las filas empieza en 2 (última) y baja hasta 0 (primera)
        for (int f = 2; f >= 0; f--) {
            for (int c = 0; c < 3; c++) {
                // Imprimimos el artículo y una pestaña (\t) para espaciarlo como tabla
                System.out.print(articulos[f][c] + "\t");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

        teclado.close();
    }
}
