package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce dos valores: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Los dos números son pares");
        } else {
            System.out.println("Ningún número es par");
        }
    }
}
