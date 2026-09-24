package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce 2 numeros: ");
        Scanner inpurtValue = new Scanner(System.in);
        num1 = inpurtValue.nextInt();
        num2 = inpurtValue.nextInt();

        if (num1 % 2 == 0 || num2 % 2 != 0) {
            System.out.println("Uno de los dos números es par");
        } if (num1 % 2 != 0 || num2 % 2 == 0) {
            System.out.println("Uno de los dos numeros es par");
        } if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("Los dos numeros son pares");
        } else {
            System.out.println("Ninguno de los numeros es par");
        }

    }
}
