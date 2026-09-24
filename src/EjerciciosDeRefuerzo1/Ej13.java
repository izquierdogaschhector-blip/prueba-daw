package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce dos números: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();

        if (num1 % 2 == 0 && num2 % 2 != 0) {
            System.out.println("El primer número es par");
        } else if (num1 % 2 != 0 && num2 % 2 == 0) {
            System.out.println("El segundo número es par");
        } else {
            System.out.println("Los dos son pares o ninguno");
        }
    }
}
