package EjerciciosJavaSophos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        // Punto 1
        int E = 5;
        double D = 10.5;
        char C = 'A';
        System.out.println("Valor de E: " + E);
        System.out.println("Valor de D: " + D);
        System.out.println("Valor de C: " + C);

        // Punto 2
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[6];
        double suma = 0;
        System.out.println("Ingrese las 6 notas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }
        Arrays.sort(notas);
        System.out.println("Promedio de notas: " + (suma / notas.length));
        System.out.println("Notas ordenadas de Mayor a Menor:");
        for (int i = notas.length - 1; i >= 0; i--) {
            System.out.println(notas[i]);
        }

        // Punto 3
        int[] numeros = new int[10];
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] >= 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }
        }
        if (contadorPositivos > 0) {
            System.out.println("Media de los valores positivos: " + (sumaPositivos / contadorPositivos));
        } else {
            System.out.println("No hay valores positivos");
        }
        if (contadorNegativos > 0) {
            System.out.println("Media de los valores negativos: " + (sumaNegativos / contadorNegativos));
        } else {
            System.out.println("No hay valores negativos");
        }

        // Punto 4
        int[] numerosArray = new int[100];
        int sumaTotal = 0;
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = i + 1;
            sumaTotal += numerosArray[i];
        }
        double media = (double) sumaTotal / numerosArray.length;
        System.out.println("Suma de todos los números: " + sumaTotal);
        System.out.println("Media de todos los números: " + media);
    }
}

