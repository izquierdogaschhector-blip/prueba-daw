package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este número es entero");
        } else {
            System.out.println("Este número no es entero");
        }

    }
}
