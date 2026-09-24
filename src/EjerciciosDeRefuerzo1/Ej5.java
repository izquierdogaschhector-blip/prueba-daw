package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int num1;
        int  num2;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();

        if (num1 == 0) {
            System.out.println("El producto de 0 por cualquier número es 0");
        } else {
            System.out.println("Introduce un segundo número: ");
            num2 = inputValue.nextInt();
            System.out.println("El producto de ambos números es: "+num1 * num2);
        }
    }
}
