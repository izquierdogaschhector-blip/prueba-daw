package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce el primer númeroa dividir: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();

        if (num2 != 0) {
            System.out.println("El resultado de la división es de: " +num1 / num2);
        } else {
            System.out.println("Error: No se puede dividir entre 0");
        }
    }
}
