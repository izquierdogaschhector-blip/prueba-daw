package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Introduce dos numeros enteros: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("EL primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
}
