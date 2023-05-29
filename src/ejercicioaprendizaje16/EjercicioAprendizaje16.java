/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicioaprendizaje16;

import java.util.Scanner;

public class EjercicioAprendizaje16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del vector: ");
        int tamaño = entrada.nextInt();

        int vector[] = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.print("Ingresa el número que desea buscar en el vector: ");
        int numero = entrada.nextInt();

        encontrarNumero(vector, tamaño, numero);
    }

    public static void encontrarNumero(int[] vector, int tamaño, int numero) {
        int contador = 0;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i] == numero) {
                System.out.println("El vector se encuentra en la posición " + "[" + i + "]");
                contador++;
            }
        }
        if (contador > 1) {
            System.out.println("El número se encuentra repetido " + contador + " veces");
        }
    }
}
