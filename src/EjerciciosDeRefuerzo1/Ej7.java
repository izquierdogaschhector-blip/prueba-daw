package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce el número: ");
        Scanner multiplo = new Scanner(System.in);
        num = multiplo.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es múltiplo de 2");
        } else if (num % 3 == 0) {
            System.out.println("Es múltiplo de 3");
        } else {
            System.out.println("No es múltiplo de 2 ni de 3");
        }
    }
}
