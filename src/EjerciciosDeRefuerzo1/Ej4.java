package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int num;
        int num2;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        if (num % 10 == 0) {
            System.out.println("Es múltiplo de 10, introduce otro número: ");
            num2 = inputValue.nextInt();
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("No es múltiplo de 10");
        }

    }
}
