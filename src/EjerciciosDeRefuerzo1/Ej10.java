package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        if (num % 2 != 0 || num % 3 != 0) {
            System.out.println("Este número no es multiplo de 2 ni de 3");
        } else {
            System.out.println("si que es múltiple");
        }
    }
}
