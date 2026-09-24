package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce dos números: ");
        Scanner pares = new Scanner(System.in);
        num1 = pares.nextInt();
        num2 = pares.nextInt();

        if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("Los dos son pares");
        }
        if (num1 % 2 != 0 || num2 % 2 != 0) {
            System.out.println("Ninguno es par");
        } else {
            System.out.println("Al menos 1 es par");
        }
    }
}