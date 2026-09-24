package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        if (num % 2 == 0 && num % 3 != 0) {
            System.out.println("El número es múltiplo de 2 pero no de 3");
        } else {
            System.out.println("No es multiplo de 2 ni de 3");
        }
    }
}
