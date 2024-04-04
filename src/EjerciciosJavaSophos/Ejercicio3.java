package EjerciciosJavaSophos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer del scanner
        
        // Implementación con la estructura de control 'for'
        int sumaFor = 0;
        for (int i = 1; i <= numero; i++) {
            sumaFor += i;
        }
        System.out.println("La suma de los números enteros entre 1 y " + numero + " es (con 'for'): " + sumaFor);
        
        // Implementación con la estructura de control 'while'
        int sumaWhile = 0;
        int contador = 1;
        while (contador <= numero) {
            sumaWhile += contador;
            contador++;
        }
        System.out.println("La suma de los números enteros entre 1 y " + numero + " es (con 'while'): " + sumaWhile);
        
        // Implementación con la estructura de control 'do-while'
        int sumaDoWhile = 0;
        int contadorDoWhile = 1;
        do {
            sumaDoWhile += contadorDoWhile;
            contadorDoWhile++;
        } while (contadorDoWhile <= numero);
        System.out.println("La suma de los números enteros entre 1 y " + numero + " es (con 'do-while'): " + sumaDoWhile);
        
        // Ejercicio 2
        System.out.print("Ingrese un número entero para verificar si es primo: ");
        int num = scanner.nextInt();
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
        
        scanner.close();
    }

}
